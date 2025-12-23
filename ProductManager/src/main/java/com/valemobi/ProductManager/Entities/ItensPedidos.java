package com.valemobi.ProductManager.Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ItemPedidos")
public class ItensPedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedidos pedido;

    @ManyToOne
    @JoinColumn(name = "produto_Id")
    private Produto produto;
    @Column(nullable = false)
    private int quantidade;
    private BigDecimal precoPedido;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItensPedidos{" +
                "Id=" + Id +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", precoPedido=" + precoPedido +
                '}';
    }
}
