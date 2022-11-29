package com.example.boteco.controller;

import com.example.boteco.entity.Funcionario;
import com.example.boteco.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente/v1")
public class ControllerFuncionario {

    @Autowired
    FuncionariosRepository funcionariosRepository;



    @PostMapping
    public Funcionario funcionario(@RequestBody @Valid Funcionario funcionario){
        Funcionario funcionarioSaved = funcionariosRepository.save(funcionario);
        return funcionarioSaved;
    }

    @GetMapping("{/id}")
    @ResponseBody
    public Optional<Funcionario> getFuncionarioById(@PathVariable @Validated Long id){
        Optional<Funcionario> funcionarioReturned = funcionariosRepository.findById(id);
        return funcionarioReturned;
    }

    @GetMapping
    public List<Funcionario> funcionarioListList(){
        return funcionariosRepository.findAll();
    }




}