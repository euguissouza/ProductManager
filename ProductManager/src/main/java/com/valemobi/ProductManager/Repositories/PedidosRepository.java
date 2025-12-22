package com.valemobi.ProductManager.Repositories;

import com.valemobi.ProductManager.Entities.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}
