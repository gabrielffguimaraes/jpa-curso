package com.jpa.project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface AgeHigherThan18Repository<E> {
    @Query("SELECT e FROM #{#entityName} e where e.idade > 18")
    List<E> ageHigherThan18();
}
