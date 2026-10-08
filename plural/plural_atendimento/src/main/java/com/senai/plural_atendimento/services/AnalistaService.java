package com.senai.plural_atendimento.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.senai.plural_atendimento.models.Analista;
import com.senai.plural_atendimento.repositories.AnalistaRepository;

@Service
public class AnalistaService {

    private final AnalistaRepository analistaRepository;
    private final PasswordEncoder passwordEncoder;

    public AnalistaService(
            AnalistaRepository analistaRepository,
            PasswordEncoder passwordEncoder) {

        this.analistaRepository = analistaRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Analista cadastrar(Analista analista) {

        String senhaCriptografada =
                passwordEncoder.encode(analista.getSenha());

        analista.setSenha(senhaCriptografada);

        return analistaRepository.save(analista);
    }
}