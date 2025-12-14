package com.valemobi.Gestao_de_pedidos_API.Entities;

//import com.valemobi.Gestao_de_pedidos_API.Services.ClienteService;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes clientes;
    private Date dataPedido;
    private PedidoStatus pedidoStatus;
    //private ClienteService frete;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Clientes getClienteId() {
        return clientes;
    }

    public void setClienteId(Clientes clienteId) {
        this.clientes = clienteId;
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

    /*public ClienteService getFrete() {
        return frete;
    }

    public void setFrete(ClienteService frete) {
        this.frete = frete;
    }*/

    @Override
    public String toString() {
        return "Pedidos{" +
                "Id=" + Id +
                ", clienteId=" + clientes +
                ", dataPedido=" + dataPedido +
                ", pedidoStatus=" + pedidoStatus +
                //", frete=" + frete +
                '}';
    }
}
