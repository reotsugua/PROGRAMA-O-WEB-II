package com.example.projetoweb.repository;

import com.example.projetoweb.model.Categoria;

import java.util.ArrayList;
import java.util.List;

public class CategoriaDBMemoria {
    private List<Categoria> lista = new ArrayList<>();
    private Integer contador = 1;

    public Categoria pegarUm(Integer id){
        Integer indice = null;
        for (Integer i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                indice = i;
                break;
            }
        }return lista.get(indice);
    }

    public Categoria criar(Categoria categoria){
        categoria.setId(contador);
        lista.add(categoria);
        contador++;
        return categoria;
    }

    public Categoria editar(Categoria categoria, Integer id){
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

    public void delete(Integer id){
        int indice = -1;
        for (Integer i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                indice = i;
                break;
            }
        }
        lista.remove(indice);
    }
}
