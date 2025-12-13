package com.valemobi.Gestao_de_pedidos_API.Repository;

import com.valemobi.Gestao_de_pedidos_API.Entities.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PedidoRepository extends JpaRepository<Pedidos, String>{
}
