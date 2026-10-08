package com.senai.plural_atendimento.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.plural_atendimento.models.Responsavel;

@Repository 
public interface ResponsavelRepository extends JpaRepository<Responsavel, Integer>{
     Optional<Responsavel> findByNome(String nome);
}
