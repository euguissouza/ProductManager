package com.valemobi.Gestao_de_pedidos_API.controller;

import com.valemobi.Gestao_de_pedidos_API.Repository.VendaRepository;
import com.valemobi.Gestao_de_pedidos_API.Services.VendasService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/valemobi-venda")
public class ControllerVenda {
    private VendaRepository  vendaRepository;
    private VendasService vendasService;

    public ControllerVenda(VendasService vendasService, VendaRepository vendaRepository) {
        this.vendasService = vendasService;
        this.vendaRepository = vendaRepository;
    }





}
