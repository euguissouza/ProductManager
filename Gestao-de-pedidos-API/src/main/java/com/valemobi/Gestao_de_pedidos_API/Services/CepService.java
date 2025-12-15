package com.valemobi.Gestao_de_pedidos_API.Services;


import com.valemobi.Gestao_de_pedidos_API.Entities.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class CepService {
    private RestClient cepRestClient;

    public CepService(RestClient cepRestClient){
        this.cepRestClient = cepRestClient;
    }

    public Endereco buscaEndereco(String cep){
        if(cep == null || cep.length() != 8){
            throw  new IllegalArgumentException("Cep invalido");
        }

        return cepRestClient.get().uri("/{cep}/json", cep)
                .retrieve().body(Endereco.class);
    }

    public Endereco preencheEndereco(Endereco endereco){
        if (endereco == null || endereco.getCep() == null){
            throw  new IllegalArgumentException("Endereço ou Cep inválido");
        }

        return cepRestClient.get().uri("/{cep}/json", endereco.getCep())
                .retrieve().body(Endereco.class);
    }



}
