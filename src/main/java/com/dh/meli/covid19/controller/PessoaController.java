package com.dh.meli.covid19.controller;

import com.dh.meli.covid19.dto.PessoaDTO;
import com.dh.meli.covid19.entity.Pessoa;
import com.dh.meli.covid19.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/findRiskPerson")
    public ResponseEntity<List<PessoaDTO>> getPessoasEmRisco(){
        return ResponseEntity.ok(PessoaDTO.convertListToDto(pessoaService.getPessoasEmRisco()));
    }

    @PostMapping("save")
    public ResponseEntity<Pessoa> savePessoa(@RequestBody Pessoa pessoa){
        pessoaService.savePessoa(pessoa);
        return ResponseEntity.ok(pessoa);
    }

}
