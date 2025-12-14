package com.valemobi.Gestao_de_pedidos_API.controller;

import com.valemobi.Gestao_de_pedidos_API.Entities.Clientes;
import com.valemobi.Gestao_de_pedidos_API.Repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valemobi")
public class ControllerAPI {

    private ClienteRepository clienteRepository;

    public ControllerAPI(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }



    @PostMapping("/cadastro-usuario")
    public ResponseEntity<Clientes> adicionaCliente(@RequestBody Clientes clientes){
        clienteRepository.save(clientes);
        System.out.println("Cliente cadastrado");
        return ResponseEntity.ok(clientes);
    }

    @GetMapping
    public ResponseEntity<List<Clientes>> buscaCliente(Clientes clientes){
        List response = clienteRepository.findAll();
        System.out.println("Consulta realizada");
        return ResponseEntity.ok(response);
    }



}
