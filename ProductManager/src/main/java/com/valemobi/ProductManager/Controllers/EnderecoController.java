package com.valemobi.ProductManager.Controllers;

import com.valemobi.ProductManager.DTO.EnderecoDTO;
import com.valemobi.ProductManager.Services.EnderecoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste-cep")
public class EnderecoController {
    private EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/{cep}")
    public EnderecoDTO buscarPorCep(@PathVariable String cep) {
        return enderecoService.completacep(cep);
    }
}
