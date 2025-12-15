package com.valemobi.Gestao_de_pedidos_API.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class CepClientConfig {

    @Bean
    public RestClient cepRestClient(){
        return RestClient.builder()
                .baseUrl("https://viacep.com.br/ws").build();

    }

}
