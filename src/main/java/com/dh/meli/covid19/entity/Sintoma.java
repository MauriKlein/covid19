package com.dh.meli.covid19.entity;

import lombok.Data;

@Data
public class Sintoma {
    private Long codigo;
    private String nome;
    private Gravidade gravidade;

}
