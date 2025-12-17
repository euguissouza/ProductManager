package com.valemobi.Gestao_de_pedidos_API.DTO;

import java.math.BigDecimal;

public class ItemVendaDTO {
    private ProdutoDTO produto;
    private int quant;
    private BigDecimal preco;

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
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
