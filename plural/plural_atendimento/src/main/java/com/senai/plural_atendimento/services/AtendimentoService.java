package com.senai.plural_atendimento.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.plural_atendimento.models.Atendimento;
import com.senai.plural_atendimento.models.Responsavel;
import com.senai.plural_atendimento.repositories.AtendimentoRepository;

@Service 
public class AtendimentoService {
    
    @Autowired 
    private AtendimentoRepository atendimentoRepository;

    public Atendimento bucarAtendimento(Date dataAtendimento){
        return atendimentoRepository.findByDataAtendimento(dataAtendimento).get();
    }

    public Atendimento atualizarData(Integer id, Date novaData) {
        Atendimento atendimento = atendimentoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Atendimento não encontrado"));
        atendimento.setDataAtendimento(novaData);

        return atendimentoRepository.save(atendimento);
    }
}
