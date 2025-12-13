package com.valemobi.Gestao_de_pedidos_API.Repository;

import com.valemobi.Gestao_de_pedidos_API.Entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Clientes, String> {
}
