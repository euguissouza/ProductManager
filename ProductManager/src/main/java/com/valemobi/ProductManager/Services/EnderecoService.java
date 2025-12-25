package com.valemobi.ProductManager.Services;

import com.valemobi.ProductManager.Configuration.ViaCepClient;
import com.valemobi.ProductManager.DTO.EnderecoDTO;
import com.valemobi.ProductManager.DTO.ViaCepDTO;
import com.valemobi.ProductManager.Entities.Endereco;
import com.valemobi.ProductManager.Repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
public class EnderecoService {
    private ViaCepClient viaCepClient;
    private EnderecoRepository enderecoRepository;

    public EnderecoService(ViaCepClient viaCepClient, EnderecoRepository enderecoRepository) {
        this.viaCepClient = viaCepClient;
        this.enderecoRepository = enderecoRepository;
    }

    public EnderecoDTO completacep(String cep){
        return viaCepClient.buscarCep(cep);
    }

    public Endereco consultaEndereco(String cep){
        EnderecoDTO dto = completacep(cep);
        Endereco endereco = new Endereco();
        endereco.setCep(dto.getCep());
        endereco.setLogradouro(dto.getLogradouro());
        endereco.setNumero(dto.getNumero());
        endereco.setComplemento(dto.getComplemento());
        endereco.setBairro(dto.getBairro());
        endereco.setLocalidade(dto.getLocalidade());
        endereco.setUf(dto.getUf());

        enderecoRepository.save(endereco);

        return endereco;
    }


}
