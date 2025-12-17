package com.valemobi.Gestao_de_pedidos_API.Services;

import com.valemobi.Gestao_de_pedidos_API.DTO.EstoqueDTO;
import com.valemobi.Gestao_de_pedidos_API.Entities.Estoque;
import com.valemobi.Gestao_de_pedidos_API.Repository.EstoqueRepository;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {
    private EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    public Estoque insereEstoque(EstoqueDTO dto){
        Estoque estoque = new Estoque();
        estoque.setProduto(dto.getProduto());
        estoque.setQuantidade(dto.getQunatidade());
        System.out.println(estoque.getProduto() + "adicionado ao estoque");
        return estoqueRepository.save(estoque);
    }



}
