package com.jpa.project.model;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nome;
    @Column
    private Integer idade;
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa() {}
}
