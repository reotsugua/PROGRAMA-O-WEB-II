package com.example.projetoweb.service;

import com.example.projetoweb.model.Categoria;
import com.example.projetoweb.repository.CategoriaDBMemoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {

    private CategoriaDBMemoria repositorio = new CategoriaDBMemoria();
    public Categoria pegarCategoriaById(Integer id){
        return repositorio.pegarUm(id);
    }
    public Categoria criar(Categoria categoria){

        return repositorio.criar(categoria);
    }
    public Categoria editar(Categoria categoria, Integer id){

        return repositorio.editar(categoria, id);
    }
    public void deletar(Integer id){
        repositorio.delete(id);
    }
}
