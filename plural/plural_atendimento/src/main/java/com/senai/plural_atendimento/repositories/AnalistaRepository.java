package com.senai.plural_atendimento.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.plural_atendimento.models.Analista;

@Repository 
public interface AnalistaRepository extends JpaRepository<Analista, Integer>{
    Optional<Analista> findByNome(String nome);
}
