package com.example.boteco.controller;

import com.example.boteco.entity.Cliente;
import com.example.boteco.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente/v1")
public class ControllerCliente {

    @Autowired
    ClienteRepository clienteRepository;



    @PostMapping
    public Cliente cliente(@RequestBody @Valid Cliente cliente){
        Cliente clienteSaved = clienteRepository.save(cliente);
        return clienteSaved;
    }

    @GetMapping("{/id}")
    @ResponseBody
    public Optional<Cliente> getClienteById(@PathVariable @Validated Long id){
        Optional<Cliente> clienteReturned = clienteRepository.findById(id);
        return clienteReturned;
    }

    @GetMapping
    public List<Cliente> clienteList(){
        return clienteRepository.findAll();
    }




}
