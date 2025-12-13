package com.valemobi.Gestao_de_pedidos_API.Services;

import com.gtbr.ViaCepClient;
import com.gtbr.domain.Cep;
import com.valemobi.Gestao_de_pedidos_API.Entities.Endereco;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.springframework.stereotype.Service;

import java.net.http.HttpRequest;

@Service
public class CepValidation {

    public Endereco getEndereco(String cep){


    }

}
