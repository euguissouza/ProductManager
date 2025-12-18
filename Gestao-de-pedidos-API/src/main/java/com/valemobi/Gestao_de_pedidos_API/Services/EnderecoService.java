package com.valemobi.Gestao_de_pedidos_API.Services;

import com.valemobi.Gestao_de_pedidos_API.DTO.EnderecoDTO;
import com.valemobi.Gestao_de_pedidos_API.DTO.ViaCepDTO;
import com.valemobi.Gestao_de_pedidos_API.Entities.Clientes;
import com.valemobi.Gestao_de_pedidos_API.Entities.Endereco;
import com.valemobi.Gestao_de_pedidos_API.Repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    private CepService cepService;
    private EnderecoRepository enderecoRepository;
    public EnderecoService(CepService cepService, EnderecoRepository enderecoRepository){
        this.cepService = cepService;
        this.enderecoRepository = enderecoRepository;
    }



    public Endereco criarEnderecoPorCep(EnderecoDTO dto) {

        ViaCepDTO buscaCep = cepService.filtraCep(dto.getCep());

        if (buscaCep == null || buscaCep.getCep() == null) {
            throw new RuntimeException("CEP inválido ou não encontrado");
        }

        Endereco endereco = new Endereco();

        endereco.setCep(buscaCep.getCep());
        endereco.setBairro(buscaCep.getBairro());
        endereco.setCidade(buscaCep.getLocalidade());
        endereco.setLongradouro(buscaCep.getLongradouro());
        endereco.setNumero(dto.getNumero());
        endereco.setComplemento(dto.getComplemento());

        return enderecoRepository.save(endereco);
    }
}
