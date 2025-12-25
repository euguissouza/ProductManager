package com.valemobi.ProductManager.DTO;

import com.valemobi.ProductManager.Entities.ItensPedidos;
import com.valemobi.ProductManager.Entities.Produto;
import com.valemobi.ProductManager.Entities.StatusPedido;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PedidosDTO {
    private long clienteId;
    private Date data;
    private StatusPedido status;
    private List<Produto> produtos;
    private BigDecimal total;
    private Boolean parcelamento;
    private int quantidade;
    private BigDecimal valorParcela;
    private BigDecimal frete;


    public long getClienteId() {
        return clienteId;
    }

    public void setClienteId(long clienteId) {
        this.clienteId = clienteId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
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

    public BigDecimal getFrete() {
        return frete;
    }

    public void setFrete(BigDecimal frete) {
        this.frete = frete;
    }
}
