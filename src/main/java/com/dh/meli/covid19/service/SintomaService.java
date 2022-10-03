package com.dh.meli.covid19.service;

import com.dh.meli.covid19.entity.Sintoma;
import com.dh.meli.covid19.repository.SintomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SintomaService {
    @Autowired
    private SintomaRepository sintomaRepository;

    public void save(Sintoma sintoma) {
        sintomaRepository.saveSintoma(sintoma);
    }

    public List<Sintoma> findAllSymptom(){
        return sintomaRepository.getSintomaList();
    }

    public Optional<Sintoma> findByName(String name){
        return sintomaRepository.getSintomaList().stream()
                .filter(s -> s.getNome().equals(name)).findFirst();
    }


}
