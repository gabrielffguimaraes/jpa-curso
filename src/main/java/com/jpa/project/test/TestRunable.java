package com.jpa.project.test;

import com.jpa.project.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.jpa.project.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Component
public class TestRunable implements ApplicationRunner {
    private static final String UNDEFINED = "UNDEFINED";
    private static final String JOAO = "João";
    private static final String MARIA = "Maria";

    @Autowired
    private PersonRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Optional<Pessoa> op = repository.findById(1);
        Optional<Pessoa> op2 = repository.findById(55);

        List<Pessoa> pessoas = repository.findAll();

        System.out.println("Hello world !");
    }
}
