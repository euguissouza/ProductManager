package com.valemobi.Gestao_de_pedidos_API.Services;

import com.valemobi.Gestao_de_pedidos_API.Entities.Clientes;
import com.valemobi.Gestao_de_pedidos_API.Entities.Endereco;
import com.valemobi.Gestao_de_pedidos_API.Repository.ClienteRepository;
import com.valemobi.Gestao_de_pedidos_API.Repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;
    private EnderecoRepository enderecoRepository;

    public ClienteService(ClienteRepository clienteRepository, EnderecoRepository enderecoRepository){
        this.clienteRepository = clienteRepository;
        this.enderecoRepository =  enderecoRepository;
    }



    public Endereco filtraCep(Endereco endereco){
        endereco.getCep();
        return enderecoRepository.save(endereco);
    }


    public Clientes CadastraClientes(Clientes clientes){
        String nome = clientes.getNome();
        String email = clientes.getEmail();
        String telefone = clientes.getTelefone();
        Endereco cep = clientes.getEndereco();
        return clienteRepository.save(clientes);
    }


}
