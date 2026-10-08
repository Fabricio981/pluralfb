package com.senai.plural_atendimento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.plural_atendimento.models.Responsavel;
import com.senai.plural_atendimento.repositories.ResponsavelRepository;

@Service 
public class ResponsavelService {

    @Autowired 
    private ResponsavelRepository responsavelRepository;

    public Responsavel bucarResponsavel(String nome){
        return responsavelRepository.findByNome(nome).get();
    }
}