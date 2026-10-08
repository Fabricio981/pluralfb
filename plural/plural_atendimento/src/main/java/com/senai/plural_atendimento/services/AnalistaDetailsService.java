package com.senai.plural_atendimento.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.senai.plural_atendimento.models.Analista;
import com.senai.plural_atendimento.repositories.AnalistaRepository;

@Service
public class AnalistaDetailsService implements UserDetailsService {

    private final AnalistaRepository analistaRepository;

    public AnalistaDetailsService(AnalistaRepository analistaRepository) {
        this.analistaRepository = analistaRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String nome)
            throws UsernameNotFoundException {

        Analista analista = analistaRepository.findByNome(nome)
                .orElseThrow(() ->
                    new UsernameNotFoundException(
                        "Analista não encontrado"
                    )
                );

        return User.builder()
                .username(analista.getNome())
                .password(analista.getSenha())
                .roles("ANALISTA")
                .build();
    }
}
