package com.valemobi.ProductManager.Services;

import com.valemobi.ProductManager.DTO.PedidosDTO;
import com.valemobi.ProductManager.Entities.*;
import com.valemobi.ProductManager.Repositories.ClienteRepository;
import com.valemobi.ProductManager.Repositories.PedidosRepository;
import com.valemobi.ProductManager.Repositories.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SellingTools {
    private ClienteService clienteService;
    private ProdutoService produtoService;
    private  ProdutoRepository produtoRepository;
    private PedidosRepository pedidosRepository;
    private ClienteRepository clienteRepository;

    public SellingTools(PedidosRepository pedidosRepository, ClienteRepository clienteRepository, ProdutoRepository produtoRepository, ClienteService clienteService, ProdutoService produtoService) {
        this.pedidosRepository = pedidosRepository;
        this.clienteRepository = clienteRepository;
        this.produtoRepository = produtoRepository;
        this.clienteService = clienteService;
        this.produtoService = produtoService;
    }

    public Pedidos pedidosRequest(PedidosDTO pedidosDTO){
        Pedidos pedido = new Pedidos();
        List<Produto> produtos = produtoRepository.findAll();
        pedido.setQuantidade(pedidosDTO.getQuantidade());


        Cliente cliente = clienteRepository.findById(pedidosDTO.getClienteId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        pedido.setCliente(cliente);


        //Adiciona os itens
        pedido.setProdutos(produtos);
        if(pedido.getProdutos() == null){
            new RuntimeException("Adicione pelo menos 1 item!");
        }

        for(Produto item : pedido.getProdutos()){
            System.out.println(item);
           Produto produto = produtoRepository.findById(item.getId()).orElseThrow(
                    () -> new RuntimeException("Produto não encontrado")
           );
            //CalculaFrete
            switch  (cliente.getEndereco().getUf()){
                case "SP" -> pedido.setFrete(new BigDecimal(10.00));
                case "RJ", "MG", "ES" -> pedido.setFrete(new BigDecimal(15.00));
                case "PR", "SC", "RS" -> pedido.setFrete( new BigDecimal(20.00));
                default -> pedido.setFrete(new BigDecimal(25.00));
            }

            
            BigDecimal valorItem = produto.getPreco()
                    .multiply(BigDecimal.valueOf(pedido.getQuantidade()));

             pedido.setTotal(valorItem);


            produtoService.baixaEstoque(produto, pedido.getQuantidade());



            //edido.setTotal(valorTotal);
            break;

        }
        pedido.setParcelamento(pedidosDTO.getParcelamento());
        pedidosRepository.save(pedido);
        System.out.println("LOG PEDIDO: " + pedido);
        return  pedido;
    }


    @Transactional
    public Pedidos iniciaVenda(PedidosDTO dto ){

        Pedidos venda = pedidosRequest(dto);



        venda.setStatus(StatusPedido.PENDENTE);
        venda.setData(new Date());



        if (venda.getTotal() == null) {
            venda.setTotal(BigDecimal.ZERO);
        }
        BigDecimal limite = BigDecimal.valueOf(100);
        if (venda.getTotal().compareTo(limite) > 0) {
            venda.setParcelamento(true);
            venda.setValorParcela(
                    venda.getTotal().divide(BigDecimal.valueOf(3))
            );
        } else {
            venda.setParcelamento(false);
        }
        System.out.println(venda);
        return venda;
    }


}