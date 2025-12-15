package com.valemobi.Gestao_de_pedidos_API.Services;

import com.valemobi.Gestao_de_pedidos_API.DTO.ClienteDTO;
import com.valemobi.Gestao_de_pedidos_API.DTO.EnderecoDTO;
import com.valemobi.Gestao_de_pedidos_API.Entities.Clientes;
import com.valemobi.Gestao_de_pedidos_API.Entities.Endereco;
import com.valemobi.Gestao_de_pedidos_API.Repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;
    private EnderecoService enderecoService;

    public ClienteService(ClienteRepository clienteRepository, EnderecoService enderecoService){
        this.clienteRepository = clienteRepository;
        this.enderecoService = enderecoService;

    }


    public Clientes salvar(ClienteDTO dto){
        Clientes cliente = new Clientes();
        Endereco endereco = new Endereco();


        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getNome());
        cliente.setTelefone(dto.getTelefone());
        cliente.setEndereco(endereco);

        return clienteRepository.save(cliente);
    }


}
