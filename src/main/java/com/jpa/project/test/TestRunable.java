package com.jpa.project.test;

import com.jpa.project.repository.ClienteRepository;
import com.jpa.project.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunable implements ApplicationRunner {
    private static final String UNDEFINED = "UNDEFINED";
    private static final String JOAO = "João";
    private static final String MARIA = "Maria";

    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        var pessoaAtivos = pessoaRepository.findAllActives();
        var clienteAtivos = clienteRepository.findAllActives();

        System.out.println("## FIM ##");
    }
}
