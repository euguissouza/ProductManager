package com.valemobi.ProductManager.Services;

import com.valemobi.ProductManager.DTO.ItensDTO;
import com.valemobi.ProductManager.DTO.ProdutoDTO;
import com.valemobi.ProductManager.Entities.ItensPedidos;
import com.valemobi.ProductManager.Entities.Produto;
import com.valemobi.ProductManager.Repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidosService {
    ProdutoService produtoService;
    ProdutoRepository produtoRepository;

    public ItemPedidosService(ProdutoService produtoService, ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
        this.produtoService = produtoService;
    }

    public ItensPedidos itemPedido(ItensDTO dto, ProdutoDTO produto){

        Produto produtos = produtoRepository.findById(dto.getProdutoId())
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        produtoService.baixaEstoque(produtos, dto.getQuantidade());

        ItensPedidos item = new ItensPedidos();

        item.setQuantidade(dto.getQuantidade());
        item.setProduto(produtoService.adicionaProduto(produto));

        return item;

    }


}
