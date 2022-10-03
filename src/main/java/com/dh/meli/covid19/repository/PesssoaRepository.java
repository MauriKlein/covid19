package com.dh.meli.covid19.repository;

import com.dh.meli.covid19.entity.Pessoa;
import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class PesssoaRepository {

    private List<Pessoa> pessoaList;

    public void savePessoa(Pessoa pessoa){
        this.pessoaList.add(pessoa);
    }

}
