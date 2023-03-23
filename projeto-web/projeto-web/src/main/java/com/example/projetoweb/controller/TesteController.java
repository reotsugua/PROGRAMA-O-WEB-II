package com.example.projetoweb.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class TesteController {
    //GET - Listagem/Item
    // /teste/ tudo depois do teste será usado no id
    @GetMapping("/{id}")   //ou @RequestMapping(method=RequestMethod.GET)
    public String testeGet(
            @RequestParam(name="nome", defaultValue = "") String nomee,
            @RequestParam(name="idade", defaultValue = "0") String idade,
            @PathVariable("id") String id
    ){
        try {
            return "ID: "+id+"Olá mundo do " + nomee + " com " + Integer.parseInt(idade) + " anos completos";
        } catch(Exception ex){
            return "Dados Inválidos";
        }
    }
}

