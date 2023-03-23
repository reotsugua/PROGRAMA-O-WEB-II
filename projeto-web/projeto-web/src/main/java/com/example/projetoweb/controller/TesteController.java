package com.example.projetoweb.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class TesteController {
    //GET - Listagem/Item
    @GetMapping   //ou @RequestMapping(method=RequestMethod.GET)
    public String testeGet(
            @RequestParam("nome") String nomee,
            @RequestParam("idade") String idade
    ){
        try {
            return "Olá mundo do " + nomee + " com " + Integer.parseInt(idade) + " anos completos";
        } catch(Exception ex){
            return "Dados Inválidos";
        }
    }
}

