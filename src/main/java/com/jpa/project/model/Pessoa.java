package com.jpa.project.model;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="tb_cliente")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nome;
    @Column
    private Integer idade;
    @Column
    private Boolean active;

    public Pessoa(String nome, Integer idade,Boolean active) {
        this.nome = nome;
        this.idade = idade;
        this.active = active;
    }
    public Pessoa() {}
}
