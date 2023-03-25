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

    @PutMapping("/{id}")
    public Categoria editar(
            @RequestBody Categoria categoria,
            @PathVariable("id") Integer id){
        categoria.setId(id);
        
        Integer indice = null;
        for (Integer i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                indice = i;
                break;
            }
        }
        lista.set(indice, categoria);
        return categoria;
    }

    @DeleteMapping("/{id}")
    public String editar(
            @PathVariable("id") Integer id) {
        int indice = -1;
        for (Integer i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                indice = i;
                break;
            }
        }
        lista.remove(indice);
        return "Categoria com o id "+id+" removido com sucesso!";
    }
}
