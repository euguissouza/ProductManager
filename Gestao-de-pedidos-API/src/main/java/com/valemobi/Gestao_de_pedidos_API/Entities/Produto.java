package com.valemobi.Gestao_de_pedidos_API.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String nomeProduto;
    private float price;
    private int estoque;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Id=" + Id +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", price=" + price +
                ", estoque=" + estoque +
                '}';
    }
}
