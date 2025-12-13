package com.valemobi.Gestao_de_pedidos_API.Repository;

import com.valemobi.Gestao_de_pedidos_API.Entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
