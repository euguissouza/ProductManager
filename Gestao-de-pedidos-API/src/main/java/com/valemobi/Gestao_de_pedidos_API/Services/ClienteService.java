package com.valemobi.Gestao_de_pedidos_API.Services;


import com.valemobi.Gestao_de_pedidos_API.Configuration.CepClientConfig;
import com.valemobi.Gestao_de_pedidos_API.Entities.Clientes;
import com.valemobi.Gestao_de_pedidos_API.Entities.Endereco;
import com.valemobi.Gestao_de_pedidos_API.Repository.ClienteRepository;
import com.valemobi.Gestao_de_pedidos_API.Repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private CepClientConfig cepClientConfig;
    private ClienteRepository clienteRepository;
    private EnderecoRepository enderecoRepository;

    public ClienteService(CepClientConfig cepClientConfig, ClienteRepository clienteRepository,
                          EnderecoRepository enderecoRepository){
        this.cepClientConfig = cepClientConfig;
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public void CadastraCliente(Clientes clientes, Endereco endereco){
        cepClientConfig.restClient().get()
                .uri("https://viacep.com.br/ws"+endereco.getCep()+"/json");
        if(endereco.getCep() == null || endereco.getCep().length() != 8){
            throw new IllegalArgumentException("Cep invalido");
        }
    }




}
