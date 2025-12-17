package com.valemobi.Gestao_de_pedidos_API.Repository;

import com.valemobi.Gestao_de_pedidos_API.Entities.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, String> {
}
