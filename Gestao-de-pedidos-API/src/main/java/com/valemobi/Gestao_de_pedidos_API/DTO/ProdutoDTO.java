package com.valemobi.Gestao_de_pedidos_API.DTO;

import java.math.BigDecimal;

public class ProdutoDTO {
    private String nomeProduto;
    private BigDecimal preco;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
