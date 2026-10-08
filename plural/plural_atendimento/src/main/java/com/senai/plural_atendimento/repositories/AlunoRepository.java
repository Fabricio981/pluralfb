package com.senai.plural_atendimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.plural_atendimento.models.Aluno;

@Repository 
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
