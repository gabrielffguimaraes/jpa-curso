package com.jpa.project.test;

import com.jpa.project.model.Cliente;
import com.jpa.project.repository.ClienteRepository;
import com.jpa.project.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;

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
    public void run(ApplicationArguments args) {
        /* ## CONSULTAS GENÉRICAS JPA ##
        var pessoaAtivos = pessoaRepository.findAllActives();
        var clienteAtivos = clienteRepository.findAllActives();
        */

        /* ## CONSULTAS A CLIENTES QUE COMEÇAM COM A LETRA R [EXAMPLE MATCHER] ##
        // BASICA
        var clientes = clienteRepository.findAll(Example.of(Cliente.builder().nome("Ramon Cliente 2").build()));
        // COMPLEXA
        var ex = ExampleMatcher
                .matching()
                .withMatcher("nome",startsWith())
                .withMatcher("cpf",startsWith());
        var clientesEx = clienteRepository.findAll(Example.of(Cliente.builder().nome("R").cpf("15").build(),ex));
        */
        System.out.println("## FIM ##");
    }
}
