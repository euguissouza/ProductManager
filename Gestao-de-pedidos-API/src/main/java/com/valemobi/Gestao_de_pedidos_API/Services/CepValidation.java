package com.valemobi.Gestao_de_pedidos_API.Services;

import com.gtbr.ViaCepClient;
import com.gtbr.domain.Cep;
import com.valemobi.Gestao_de_pedidos_API.Entities.Endereco;
import org.springframework.stereotype.Service;

@Service
public class CepValidation {

    private Endereco endereco;
    public CepValidation (Endereco endereco){
        this.endereco = endereco;
    }
    Cep cep = ViaCepClient.findCep(endereco.getCep());

}
