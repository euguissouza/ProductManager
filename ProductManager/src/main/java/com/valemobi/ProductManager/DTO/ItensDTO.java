package com.valemobi.ProductManager.DTO;

import com.valemobi.ProductManager.Entities.Produto;

import java.math.BigDecimal;

public class ItensDTO {

    private Long produtoId;
    private int quantia;
    private BigDecimal precoPedido;

    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantia) {
        this.quantia = quantia;
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
