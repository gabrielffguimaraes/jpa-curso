package com.jpa.project.mock;

import com.jpa.project.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.jpa.project.repository.PessoaRepository;

@Component
public class MockPessoa implements ApplicationRunner {

    @Autowired
    private PessoaRepository pessoaRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.pessoaRepository.save(new Pessoa("João",20,false));
        this.pessoaRepository.save(new Pessoa("João",40,false));
        this.pessoaRepository.save(new Pessoa("Maria",25,false));
        this.pessoaRepository.save(new Pessoa("Joana",17,false));
        this.pessoaRepository.save(new Pessoa("Pedro",19,true));
        this.pessoaRepository.save(new Pessoa("João",80,true));
    }
}
