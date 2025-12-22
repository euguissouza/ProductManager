package com.valemobi.ProductManager.Configuration;

import com.valemobi.ProductManager.DTO.EnderecoDTO;
import com.valemobi.ProductManager.DTO.ViaCepDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "viacep-client",
        url = "https://viacep.com.br"
)
public interface ViaCepClient {
    @GetMapping("/ws/{cep}/json/")
    EnderecoDTO buscarCep(@PathVariable("cep") String cep);
}
