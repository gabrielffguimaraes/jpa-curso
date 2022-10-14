package com.jpa.project.mock;

import com.jpa.project.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.jpa.project.repository.PersonRepository;

@Component
public class Mock implements ApplicationRunner {

    @Autowired
    private PersonRepository personRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.personRepository.save(new Pessoa("João",20));
        this.personRepository.save(new Pessoa("João",40));
        this.personRepository.save(new Pessoa("Maria",25));
        this.personRepository.save(new Pessoa("Joana",19));
        this.personRepository.save(new Pessoa("Pedro",19));
    }
}
