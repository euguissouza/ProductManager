package com.valemobi.Gestao_de_pedidos_API.Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String nomeProduto;
    private BigDecimal price;
    private int quantidade = 30;



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Id=" + Id +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", price=" + price +
                '}';
    }
}
