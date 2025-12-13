package com.valemobi.Gestao_de_pedidos_API.Entities;

import com.valemobi.Gestao_de_pedidos_API.Services.CepValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private Clientes clienteId;
    private Date dataPedido;
    private PedidoStatus pedidoStatus;
    private CepValidation frete;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Clientes getClienteId() {
        return clienteId;
    }

    public void setClienteId(Clientes clienteId) {
        this.clienteId = clienteId;
    }

    public PedidoStatus getPedidoStatus() {
        return pedidoStatus;
    }

    public void setPedidoStatus(PedidoStatus pedidoStatus) {
        this.pedidoStatus = pedidoStatus;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public CepValidation getFrete() {
        return frete;
    }

    public void setFrete(CepValidation frete) {
        this.frete = frete;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "Id=" + Id +
                ", clienteId=" + clienteId +
                ", dataPedido=" + dataPedido +
                ", pedidoStatus=" + pedidoStatus +
                ", frete=" + frete +
                '}';
    }
}
