package com.jpa.project.repository;

import com.jpa.project.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Integer>,ActiveRepository<Pessoa>, AgeHigherThan18Repository,FirstNameRepository {
    <T> Collection<T> findByNome(String nome, Class<T> type);
}
