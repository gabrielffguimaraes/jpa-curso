package com.jpa.project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface FirstNameRepository<E> {
    @Query(value = "SELECT nome, LEFT(nome,locate(' ',nome)-1) AS firstName FROM #{#entityName} ",nativeQuery = true)
    List<E> findByFirstName();
}
