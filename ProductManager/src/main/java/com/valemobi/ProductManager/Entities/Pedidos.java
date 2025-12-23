package com.valemobi.ProductManager.Entities;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    private Date data;
    private StatusPedido status;
    @OneToMany(
            mappedBy = "pedido",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ItensPedidos> pedidosList;

    private BigDecimal total;

    private Boolean parcelamento;

    private BigDecimal valorParcela;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }


    public List<ItensPedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<ItensPedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setId(long id) {
        Id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(Boolean parcelamento) {
        this.parcelamento = parcelamento;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                ", cliente=" + cliente +
                ", data=" + data +
                ", status=" + status +
                ", pedidosList=" + pedidosList +
                ", total=" + total +
                ", valorParcela" + valorParcela+
                '}';
    }
}
