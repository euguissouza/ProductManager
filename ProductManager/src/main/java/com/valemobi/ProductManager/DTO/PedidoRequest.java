package com.valemobi.ProductManager.DTO;

import java.util.List;

public class PedidoRequest {
    private PedidosDTO pedido;
    private List<ItensDTO> itens;


    public PedidosDTO getPedido() {
        return pedido;
    }

    public void setPedido(PedidosDTO pedido) {
        this.pedido = pedido;
    }

    public List<ItensDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItensDTO> itens) {
        this.itens = itens;
    }
}
