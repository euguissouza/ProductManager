package com.valemobi.ProductManager.Services;

import com.valemobi.ProductManager.DTO.ClienteDTO;
import com.valemobi.ProductManager.DTO.EnderecoDTO;
import com.valemobi.ProductManager.Entities.Cliente;
import com.valemobi.ProductManager.Entities.Endereco;
import com.valemobi.ProductManager.Repositories.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private EnderecoService enderecoService;
    private ClienteRepository clienteRepository;

    public ClienteService(EnderecoService enderecoService, ClienteRepository clienteRepository) {
        this.enderecoService = enderecoService;
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvaCliente(ClienteDTO dto){
        Cliente cliente =  new Cliente();
        Endereco endereco = enderecoService.consultaEndereco(dto.getCep());
       cliente.setNome(dto.getNome());
       cliente.setEmail(dto.getEmail());
       cliente.setTelefone(dto.getTelefone());
       endereco.setNumero(dto.getNumero());
       endereco.setComplemento(dto.getComplemento());
       endereco.setCliente(cliente);
       cliente.setEndereco(endereco);
       Cliente clienteSalvo = clienteRepository.save(cliente);

        System.out.println("Log Cliente: " + clienteSalvo);
       return clienteSalvo;
    }



}
