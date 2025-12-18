package com.valemobi.Gestao_de_pedidos_API.Repository;

import com.valemobi.Gestao_de_pedidos_API.Entities.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ItemVendaRepository extends JpaRepository<ItemVenda ,Long> {
}
