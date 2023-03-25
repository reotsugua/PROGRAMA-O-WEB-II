package com.example.projetoweb.service;

import com.example.projetoweb.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {
    private List<Categoria> lista = new ArrayList<>();
    public Categoria pegarCategoriaById(Integer id){
        Integer indice = null;
        for (Integer i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                indice = i;
                break;
            }
        }
        return indice;
    }
    public Categoria criar(Categoria categoria){
        return null;
    }
    public Categoria editar(Categoria categoria, Integer id){
        return null;
    }
    public void deletar(Integer id){}
}
