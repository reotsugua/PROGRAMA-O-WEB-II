package com.example.projetoweb.controller;

import com.example.projetoweb.model.Categoria;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private List<Categoria> lista = new ArrayList<>();
    private Integer contador = 1;
    @GetMapping
    public List<Categoria> listar(){
        return lista;
    }

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria){
        categoria.setId(contador);
        lista.add(categoria);
        contador++;
        return categoria;
    }
}
