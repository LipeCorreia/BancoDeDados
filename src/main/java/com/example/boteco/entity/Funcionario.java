package com.example.boteco.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer salario;
    private String departamento;

    public Funcionario(Integer salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public Funcionario() {
    }

    public Long getId() {
        return id;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
