package com.cadastro.cadastro.controllers;

import com.cadastro.cadastro.domain.Usuario;
import com.cadastro.cadastro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController  {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/add")
    public ResponseEntity<Usuario> add(@RequestBody Usuario usuario) {
        Usuario p;
        try{
            p = repository.save(usuario);
            return new ResponseEntity<>(p, HttpStatus.CREATED);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/all")
    public ArrayList<Usuario> getAll() {
        return repository.findAll();
    }

}
