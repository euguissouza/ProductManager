package com.valemobi.ProductManager.Controllers;

import com.valemobi.ProductManager.DTO.ProdutoDTO;
import com.valemobi.ProductManager.Entities.Produto;
import com.valemobi.ProductManager.Repositories.ProdutoRepository;
import com.valemobi.ProductManager.Services.ProdutoService;
import com.valemobi.ProductManager.Services.SellingTools;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valemobi-products")
public class ProdutoController {
    private ProdutoRepository produtoRepository;
    private ProdutoService produtoService;

    public ProdutoController(ProdutoRepository produtoRepository, ProdutoService produtoService) {
        this.produtoRepository = produtoRepository;
        this.produtoService = produtoService;
    }

    @PostMapping("/cadastra-produto")
    public ResponseEntity<ProdutoDTO> adicionaProduto(@RequestBody ProdutoDTO produtoDTO){
        Produto produto = produtoService.adicionaProduto(produtoDTO);

        return ResponseEntity.ok(produtoDTO);
    }

    @GetMapping("/catalogo")
    public ResponseEntity<List<Produto>> buscaProduto(Produto produto){
        List<Produto> catalogo = produtoRepository.findAll();
        return ResponseEntity.ok(catalogo);
    }





}
