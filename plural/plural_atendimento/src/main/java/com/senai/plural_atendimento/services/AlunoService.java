package com.senai.plural_atendimento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.plural_atendimento.models.Aluno;
import com.senai.plural_atendimento.repositories.AlunoRepository;

@Service 
public class AlunoService {
    @Autowired 
    private AlunoRepository alunoRepository;

    public Aluno cadastrarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
