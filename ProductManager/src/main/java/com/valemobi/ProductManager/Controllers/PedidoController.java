package com.valemobi.ProductManager.Controllers;

import com.valemobi.ProductManager.DTO.PedidosDTO;
import com.valemobi.ProductManager.Entities.Pedidos;
import com.valemobi.ProductManager.Repositories.PedidosRepository;
import com.valemobi.ProductManager.Services.SellingTools;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valemobi-pedido")
public class PedidoController {
    private PedidosRepository pedidosRepository;
    private SellingTools sellingTools;

    public PedidoController(PedidosRepository pedidosRepository, SellingTools sellingTools) {
        this.pedidosRepository = pedidosRepository;
        this.sellingTools = sellingTools;
    }

    @PostMapping("/gera-pedido")
    public ResponseEntity<Pedidos> novaVenda(@RequestBody PedidosDTO dto){
        Pedidos novoPedido = sellingTools.iniciaVenda(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPedido);
    }

    @GetMapping("/historico-pedidos")
    public ResponseEntity<List<Pedidos>> filtraPedidos(Pedidos pedidos){
        List<Pedidos> pedido = pedidosRepository.findAll();

        return ResponseEntity.ok(pedido);

    }



}
