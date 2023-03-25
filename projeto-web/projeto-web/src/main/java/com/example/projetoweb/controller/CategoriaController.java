package com.example.projetoweb.controller;

import com.example.projetoweb.model.Categoria;
import com.example.projetoweb.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    private List<Categoria> lista = new ArrayList<>();
    private Integer contador = 1;

    @Autowired
    private CategoriaService categoriaService;
    @GetMapping
    public List<Categoria> listar(){
        return lista;
    }

    @GetMapping("/{id}")
    public Categoria pegarUm(
            @PathVariable("id") Integer id){
        return categoriaService.pegarCategoriaById(id);
    }

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria){
        return categoriaService.criar(categoria);
    }

    @PutMapping("/{id}")
    public Categoria deletar(
            @RequestBody Categoria categoria,
            @PathVariable("id") Integer id){
        return categoriaService.editar(categoria,id);
    }

    @DeleteMapping("/{id}")
    public String deletar(
            @PathVariable("id") Integer id) {
        categoriaService.deletar(id);
        return "Categoria com o id "+id+" removido com sucesso!";
    }
}
