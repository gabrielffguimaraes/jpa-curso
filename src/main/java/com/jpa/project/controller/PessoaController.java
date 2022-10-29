package com.jpa.project.controller;

import com.jpa.project.model.Pessoa;
import com.jpa.project.model.PessoaDto;
import com.jpa.project.repository.PessoaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {
    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping("dto")
    ResponseEntity<?> findAllDto() {
        return ResponseEntity.ok(this.pessoaRepository.findByNome("João", PessoaDto.class));
    }
    @GetMapping
    ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.pessoaRepository.findByNome("João", Pessoa.class));
    }
}
