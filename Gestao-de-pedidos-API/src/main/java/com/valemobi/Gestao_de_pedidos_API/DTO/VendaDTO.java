package com.valemobi.Gestao_de_pedidos_API.DTO;

import java.time.LocalDateTime;
import java.util.List;

public class VendaDTO {
    private ClienteDTO cliente;
    private List<ItemVendaDTO> items;
    private LocalDateTime dataVenda;

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<ItemVendaDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemVendaDTO> items) {
        this.items = items;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
}
