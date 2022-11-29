package com.example.boteco.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private List<Produtos>produtos;

    public Cliente(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
}
