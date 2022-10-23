package com.jpa.project.repository;

import com.jpa.project.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Integer>,ActiveRepository<Pessoa> {
}
