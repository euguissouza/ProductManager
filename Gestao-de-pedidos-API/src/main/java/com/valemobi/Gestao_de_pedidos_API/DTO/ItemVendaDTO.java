package com.valemobi.Gestao_de_pedidos_API.DTO;

import java.math.BigDecimal;

public class ItemVendaDTO {

    private String produto;
    private int quant;
    private BigDecimal preco;


    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
