package com.valemobi.ProductManager.Services;

import com.valemobi.ProductManager.DTO.ItensDTO;
import com.valemobi.ProductManager.DTO.ProdutoDTO;
import com.valemobi.ProductManager.Entities.ItensPedidos;
import com.valemobi.ProductManager.Entities.Produto;
import com.valemobi.ProductManager.Repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto adicionaProduto(ProdutoDTO dto){
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());
        produto.setQuantidade(dto.getQuantidade());


        return produtoRepository.save(produto);

    }


    public void baixaEstoque(Produto produto, int quantidade) {

        if(quantidade > produto.getQuantidade()){
            throw new RuntimeException("Quantidade selecionada insuficiente em estoque");
        }
        produto.setQuantidade(produto.getQuantidade() - quantidade);
        produtoRepository.save(produto);


    }

}
