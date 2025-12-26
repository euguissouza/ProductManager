package com.valemobi.ProductManager.DTO;

import com.valemobi.ProductManager.Entities.Endereco;
import jakarta.persistence.*;

import java.math.BigInteger;

public class ClienteDTO {

    private String nome;
    private String email;
    private BigInteger telefone;
    private String cep;
    private  String numero;
    private String complemento;

    public ClienteDTO(){
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public BigInteger getTelefone() {
        return telefone;
    }

    public void setTelefone(BigInteger telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
