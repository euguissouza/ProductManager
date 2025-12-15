package com.valemobi.Gestao_de_pedidos_API.DTO;

public class ClienteDTO {
    private String nome;
    private String email;
    private String telefone;
    private ViaCepDTO endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ViaCepDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(ViaCepDTO endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
