package com.valemobi.Gestao_de_pedidos_API.Services;

import com.valemobi.Gestao_de_pedidos_API.DTO.ItemVendaDTO;
import com.valemobi.Gestao_de_pedidos_API.DTO.VendaDTO;
import com.valemobi.Gestao_de_pedidos_API.Entities.ItemVenda;
import com.valemobi.Gestao_de_pedidos_API.Entities.Produto;
import com.valemobi.Gestao_de_pedidos_API.Entities.Venda;
import com.valemobi.Gestao_de_pedidos_API.Repository.ItemVendaRepository;
import com.valemobi.Gestao_de_pedidos_API.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemVendaService {
    private ItemVendaRepository itemVendaRepository;
    private ProdutoRepository produtoRepository;

    public ItemVendaService(ItemVendaRepository itemVendaRepository, ProdutoRepository produtoRepository) {
        this.itemVendaRepository = itemVendaRepository;
        this.produtoRepository = produtoRepository;
    }

     private ItemVenda recebeItem(ItemVendaDTO dto){
        Produto  produto = produtoRepository.findById( dto.getProduto())
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        ItemVenda item = new ItemVenda();
        item.setProduto(produto);
        item.setPreco(dto.getPreco());
        item.setQuantidadeItem(dto.getQuant());
        return item;
    }
     public  void processaVenda(VendaDTO dto){
        List<ItemVenda> itens = new ArrayList<ItemVenda>();

        for(ItemVendaDTO itemDTO : dto.getItems()){
            ItemVenda item = recebeItem(itemDTO);
            itens.add(item);
        }
        Venda venda = new Venda();
        Boolean parcela = false;

        if(dto.getPreco().compareTo(BigDecimal.valueOf(100.00)) == 0){
            parcela = true;
        }else if(parcela = true){
            BigDecimal valorParcela = dto.getPreco().divide(BigDecimal.valueOf(3));

        }

     }













}
