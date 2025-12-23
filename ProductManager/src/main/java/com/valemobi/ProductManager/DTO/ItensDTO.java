package com.valemobi.ProductManager.DTO;

import java.math.BigDecimal;

public class ItensDTO {

    private Long produtoId;
    private int quantidade;
    private BigDecimal precoPedido;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public BigDecimal getPrecoPedido() {
        return precoPedido;
    }

    public void setPrecoPedido(BigDecimal precoPedido) {
        this.precoPedido = precoPedido;
    }
}
