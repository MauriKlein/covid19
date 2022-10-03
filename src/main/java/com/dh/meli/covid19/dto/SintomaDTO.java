package com.dh.meli.covid19.dto;

import com.dh.meli.covid19.entity.Gravidade;
import com.dh.meli.covid19.entity.Sintoma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SintomaDTO {
    private String nome;
    private Gravidade gravidade;

    public static SintomaDTO convertToDto(Sintoma sintoma){
        return new SintomaDTO(sintoma.getNome(), sintoma.getGravidade());
    }

}
