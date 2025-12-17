package com.valemobi.Gestao_de_pedidos_API.DTO;

import com.valemobi.Gestao_de_pedidos_API.Entities.Produto;

public class EstoqueDTO {
    private Produto produto;
    private int qunatidade = produto.getQuantidade();

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQunatidade() {
        return qunatidade;
    }

    public void setQunatidade(int qunatidade) {
        this.qunatidade = qunatidade;
    }
}
