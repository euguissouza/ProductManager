package com.valemobi.Gestao_de_pedidos_API.Services;

import com.valemobi.Gestao_de_pedidos_API.DTO.ProdutoDTO;
import com.valemobi.Gestao_de_pedidos_API.Entities.Produto;
import com.valemobi.Gestao_de_pedidos_API.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    public Produto salvaProduto(ProdutoDTO dto){
        Produto produto = new Produto();

        produto.setNomeProduto(dto.getNomeProduto());
        produto.setPrice(dto.getPreco());
        return produtoRepository.save(produto);
    }



}
