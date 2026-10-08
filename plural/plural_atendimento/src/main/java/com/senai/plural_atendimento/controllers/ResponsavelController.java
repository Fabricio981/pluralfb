package com.senai.plural_atendimento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.plural_atendimento.models.Responsavel;
import com.senai.plural_atendimento.services.ResponsavelService;

@RestController
public class ResponsavelController {

    @Autowired
    private ResponsavelService responsavelService;

    @GetMapping("/responsavel/buscar")
    public Responsavel buscarResponsavel(@RequestParam String nome) {
        return responsavelService.bucarResponsavel(nome);
    }
}
