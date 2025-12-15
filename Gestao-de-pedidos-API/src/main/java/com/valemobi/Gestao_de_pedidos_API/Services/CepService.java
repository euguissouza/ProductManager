package com.valemobi.Gestao_de_pedidos_API.Services;


import com.valemobi.Gestao_de_pedidos_API.DTO.EnderecoDTO;
import com.valemobi.Gestao_de_pedidos_API.DTO.ViaCepDTO;
import com.valemobi.Gestao_de_pedidos_API.Entities.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class CepService {
    private RestClient cepRestClient;

    public CepService(RestClient cepRestClient){
        this.cepRestClient = cepRestClient;
    }

    public EnderecoDTO filtraCep(String cep){
        return cepRestClient.get().uri("/{cep}/json")
                .retrieve().body(EnderecoDTO.class);
    }





}
