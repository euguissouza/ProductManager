package com.valemobi.ProductManager.Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Pedidos")
public class ItensPedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @ManyToOne
    @JoinColumn(name = "produto_Id")
    private Produto produto;
    private int quantia;
    private BigDecimal precoPedido;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public BigDecimal getPrecoPedido() {
        return precoPedido;
    }

    public void setPrecoPedido(BigDecimal precoPedido) {
        this.precoPedido = precoPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantia() {
        return quantia;
    }

    public void setQuantia(int quantia) {
        this.quantia = quantia;
    }

    @Override
    public String toString() {
        return "ItensPedidos{" +
                "Id=" + Id +
                ", produto=" + produto +
                ", quantia=" + quantia +
                ", precoPedido=" + precoPedido +
                '}';
    }
}
