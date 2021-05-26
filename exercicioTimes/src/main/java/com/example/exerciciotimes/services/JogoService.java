package com.example.exerciciotimes.services;

import com.example.exerciciotimes.domain.Jogo;
import com.example.exerciciotimes.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {
    @Autowired
    JogoRepository repository;

    public Jogo cadastrarJogo(Jogo jogo){
        return repository.save(jogo);
    }

    public List<Jogo> filtrarPorData(String data){
        return repository.findByData(data);
    }

    public List<Jogo> filtrarPorTime(Integer id){
        return repository.
    }

}
