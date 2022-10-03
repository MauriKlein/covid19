package com.dh.meli.covid19.service;

import com.dh.meli.covid19.entity.Pessoa;
import com.dh.meli.covid19.repository.PesssoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {
    @Autowired
    private PesssoaRepository pessoaRepository;

    public void savePessoa(Pessoa pessoa){
        pessoaRepository.savePessoa(pessoa);
    }

    public List<Pessoa> getPessoasEmRisco(){
        return pessoaRepository.getPessoaList().stream()
                .filter(p -> p.getIdade()>60)
                .collect(Collectors.toList());
    }




}
