package com.example.boteco.controller;

import com.example.boteco.entity.Usuario;
import com.example.boteco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente/v1")
public class ControllerUsuario {

    @Autowired
    UsuarioRepository usuarioRepository;



    @PostMapping
    public Usuario usuario(@RequestBody @Valid Usuario usuario){
        Usuario usuarioSaved = usuarioRepository.save(usuario);
        return usuarioSaved;
    }

    @GetMapping("{/id}")
    @ResponseBody
    public Optional<Usuario>getUsuarioById(@PathVariable @Validated Long id){
        Optional<Usuario> usuarioReturned = usuarioRepository.findById(id);
        return usuarioReturned;
    }

    @GetMapping
    public List<Usuario> usuariosList(){
        return usuarioRepository.findAll();
    }

}
