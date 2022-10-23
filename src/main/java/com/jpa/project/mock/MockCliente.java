package com.jpa.project.mock;

import com.jpa.project.model.Cliente;
import com.jpa.project.repository.ClienteRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MockCliente implements ApplicationRunner {

    private final ClienteRepository clienteRepository;

    public MockCliente(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        this.clienteRepository.save(Cliente.builder().nome("Cliente 1 true").cpf("142.242.807-12").active(true).build());
        this.clienteRepository.save(Cliente.builder().nome("Cliente 2").cpf("152.242.807-23").active(false).build());
        this.clienteRepository.save(Cliente.builder().nome("Cliente 3").cpf("162.242.807-34").active(false).build());
        this.clienteRepository.save(Cliente.builder().nome("Cliente 4 true").cpf("172.242.807-45").active(true).build());
        this.clienteRepository.save(Cliente.builder().nome("Cliente 5").cpf("182.242.807-56").active(false).build());
    }
}
