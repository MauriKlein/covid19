package com.dh.meli.covid19.repository;

import com.dh.meli.covid19.entity.Sintoma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class SintomaRepository {

    private List<Sintoma> sintomaList;

    public void saveSintoma(Sintoma sintoma){
        this.sintomaList.add(sintoma);
    }

}
