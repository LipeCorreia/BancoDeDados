package com.example.boteco.controller;

import com.example.boteco.entity.Produtos;

import com.example.boteco.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente/v1")
public class ControllerProduto {

    @Autowired
    ProdutoRepository produtoRepository;



    @PostMapping
    public Produtos produtos(@RequestBody @Valid Produtos produtos){
        Produtos produtosSaved = produtoRepository.save(produtos);
        return produtosSaved;
    }

    @GetMapping("{/id}")
    @ResponseBody
    public Optional<Produtos> getProdutosById(@PathVariable @Validated Long id){
        Optional<Produtos> produtosReturned = produtoRepository.findById(id);
        return produtosReturned;
    }

    @GetMapping
    public List<Produtos> ProdutosList(){
        return produtoRepository.findAll();
    }




}
