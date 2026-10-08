package com.senai.plural_atendimento.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.plural_atendimento.models.Atendimento;
import com.senai.plural_atendimento.models.Responsavel;

@Repository 
public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer>{
    Optional<Atendimento> findByDataAtendimento(Date dataAtendimento);
}

