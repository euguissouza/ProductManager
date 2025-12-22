package com.valemobi.ProductManager.Services;

import com.valemobi.ProductManager.DTO.PedidosDTO;
import com.valemobi.ProductManager.Entities.Cliente;
import com.valemobi.ProductManager.Entities.ItensPedidos;
import com.valemobi.ProductManager.Entities.Pedidos;
import com.valemobi.ProductManager.Repositories.ClienteRepository;
import com.valemobi.ProductManager.Repositories.PedidosRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SellingTools {
    private PedidosRepository pedidosRepository;
    private ClienteRepository clienteRepository;

    public SellingTools(PedidosRepository pedidosRepository, ClienteRepository clienteRepository) {
        this.pedidosRepository = pedidosRepository;
        this.clienteRepository = clienteRepository;
    }

    public Pedidos pedidosRequest(PedidosDTO pedidosDTO){
        Pedidos pedido = new Pedidos();
        Cliente cliente = clienteRepository.findById(pedidosDTO.getClienteId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        pedido.setCliente(cliente);
        pedido.setPedidosList(pedidosDTO.getPedidosList());
        pedido.setTotal(pedidosDTO.getTotal());
        pedido.setParcelamento(pedidosDTO.getParcelamento());
        return pedidosRepository.save(pedido);
    }


    @Transactional
    public Pedidos novoPedido(PedidosDTO dto){
        Pedidos venda = pedidosRequest(dto);
        BigDecimal limite = new BigDecimal(100.00);

        //parcelas
        if(venda.getTotal().compareTo(limite) > 0 ){
            venda.setParcelamento(true);
            venda.setValorParcela(
                    venda.getTotal().divide(BigDecimal.valueOf(3))
            );
        }else{
            venda.setParcelamento(false);
        }

        return venda;
    }


}












