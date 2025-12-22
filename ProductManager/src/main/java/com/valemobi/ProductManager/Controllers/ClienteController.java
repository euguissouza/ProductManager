package com.valemobi.ProductManager.Controllers;

import com.valemobi.ProductManager.DTO.ClienteDTO;
import com.valemobi.ProductManager.Entities.Cliente;
import com.valemobi.ProductManager.Repositories.ClienteRepository;
import com.valemobi.ProductManager.Services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valemobi-clentes")
public class ClienteController {
    private ClienteRepository clienteRepository;
    private ClienteService clienteService;

    public ClienteController(ClienteRepository clienteRepository, ClienteService clienteService) {
        this.clienteRepository = clienteRepository;
        this.clienteService = clienteService;
    }

    @PostMapping("cadastra-clientes")
    public ResponseEntity<ClienteDTO> cadastraCliente(@RequestBody ClienteDTO dto){
        Cliente cliente = clienteService.salvaCliente(dto);
        System.out.println("Cliente Cadastrado");

        return ResponseEntity.ok(dto);
    }

    @GetMapping("/pesquisa-cliente")
    public ResponseEntity<List<Cliente>> buscaCliente(Cliente cliente){
        List<Cliente> list = clienteRepository.findAll();

        return ResponseEntity.ok(list);
    }



}
