package com.senai.plural_atendimento.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity 
@Table(name="aluno")
public class Aluno {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @OneToMany 
    @JoinColumn(name="responsavel_id")
    private List<Responsavel>responsavel;

    public Aluno() {
    }

    public Aluno(Integer id, String nome, List<Responsavel> responsavels) {
        this.id = id;
        this.nome = nome;
        this.responsavel = responsavels;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Responsavel> getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(List<Responsavel> responsavel) {
        this.responsavel = responsavel;
    }

    
}
