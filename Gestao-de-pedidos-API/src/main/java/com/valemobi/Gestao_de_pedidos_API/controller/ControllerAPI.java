package com.valemobi.Gestao_de_pedidos_API.controller;

import com.valemobi.Gestao_de_pedidos_API.DTO.ClienteDTO;
import com.valemobi.Gestao_de_pedidos_API.Entities.Clientes;
import com.valemobi.Gestao_de_pedidos_API.Repository.ClienteRepository;
import com.valemobi.Gestao_de_pedidos_API.Services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valemobi")
public class ControllerAPI {

    private ClienteService clienteService;
    private ClienteRepository clienteRepository;
    public ControllerAPI(ClienteService clienteService, ClienteRepository clienteRepository){
        this.clienteService = clienteService;
        this.clienteRepository = clienteRepository;
    }



    @PostMapping("/cadastro-usuario")
    public ResponseEntity<ClienteDTO> salvaCliente(@RequestBody ClienteDTO dto){
        Clientes clientes = clienteService.salvar(dto);
        System.out.println("Cliente Cadastrado");
        return ResponseEntity.ok(dto);
    }



    @GetMapping
    public ResponseEntity<List<Clientes>> buscaCliente(Clientes clientes){
        List response = clienteRepository.findAll();
        System.out.println("Consulta realizada");
        return ResponseEntity.ok(response);
    }



}
