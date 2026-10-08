package com.senai.plural_atendimento.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.senai.plural_atendimento.models.Atendimento;
import com.senai.plural_atendimento.services.AtendimentoService;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping("/buscar")
    public Atendimento buscarAtendimento(@RequestParam Date data) {
        return atendimentoService.bucarAtendimento(data);
    }

    @PutMapping("/atualizar/{id}")
    public Atendimento atualizarData(
            @PathVariable Integer id,
            @RequestParam Date novaData) {

        return atendimentoService.atualizarData(id, novaData);
    }
}