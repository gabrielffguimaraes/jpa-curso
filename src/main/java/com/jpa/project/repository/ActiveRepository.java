package com.jpa.project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface ActiveRepository<E> {
    @Query("SELECT e FROM #{#entityName} e WHERE e.active = true")
    List<E> findAllActives();
}
