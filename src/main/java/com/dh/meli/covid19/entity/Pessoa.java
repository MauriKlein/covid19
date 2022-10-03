package com.dh.meli.covid19.entity;

import lombok.Data;

@Data
public class Pessoa {
    private Long id;
    private String nome;
    private String sobrenome;
    private int idade;

}
