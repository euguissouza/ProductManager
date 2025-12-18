package com.valemobi.Gestao_de_pedidos_API.Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "itemVenda")
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "produtoId")
    private Produto produto;
    private int quantidadeItem;
    private BigDecimal preco;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }



    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }
}
