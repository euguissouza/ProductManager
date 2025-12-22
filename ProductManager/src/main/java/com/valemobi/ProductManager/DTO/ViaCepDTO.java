package com.valemobi.ProductManager.DTO;

public record ViaCepDTO (
    String cep,
    String logradouro,
    String complemento,
    String bairro,
    String localidade,
    String uf
    ){}


