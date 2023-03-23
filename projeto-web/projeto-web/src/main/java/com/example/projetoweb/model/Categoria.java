package com.example.projetoweb.model;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor pra usar o NonNull
public class Categoria {
    private Integer id;
    //@NonNull
    private String nome;
    private String descricao;
}
