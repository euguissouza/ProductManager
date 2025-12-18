package com.valemobi.Gestao_de_pedidos_API.Services;

import com.valemobi.Gestao_de_pedidos_API.DTO.ItemVendaDTO;
import com.valemobi.Gestao_de_pedidos_API.DTO.VendaDTO;
import com.valemobi.Gestao_de_pedidos_API.Entities.Clientes;
import com.valemobi.Gestao_de_pedidos_API.Entities.ItemVenda;
import com.valemobi.Gestao_de_pedidos_API.Entities.Venda;
import com.valemobi.Gestao_de_pedidos_API.Repository.ClienteRepository;
import com.valemobi.Gestao_de_pedidos_API.Repository.VendaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendasService {
    private ClienteService clienteService;
    private ProdutoService produtoService;
    private EstoqueService estoqueService;
    private VendaRepository vendaRepository;
    private ClienteRepository clienteRepository;
    private ItemVendaService itemVendaService;
    private ItemVendaDTO itemVendaDTO;

    public VendasService(ClienteService clienteService, VendaRepository vendaRepository,
                         EstoqueService estoqueService, ProdutoService produtoService, ClienteRepository clienteRepository, ItemVendaService itemVendaService) {
        this.clienteService = clienteService;
        this.vendaRepository = vendaRepository;
        this.estoqueService = estoqueService;
        this.produtoService = produtoService;
        this.clienteRepository = clienteRepository;
        this.itemVendaService = itemVendaService;
    }

  /*  private  Venda carrinho(VendaDTO dto){
        Venda venda = new Venda();
        venda.setDataVenda(dto.getDataVenda());


    }*/















}
