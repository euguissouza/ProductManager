package com.valemobi.ProductManager.Repositories;

import com.valemobi.ProductManager.Entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
