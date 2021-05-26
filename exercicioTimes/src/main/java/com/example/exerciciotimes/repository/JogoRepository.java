package com.example.exerciciotimes.repository;

import com.example.exerciciotimes.domain.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JogoRepository extends JpaRepository<Jogo, Integer> {
    public List<Jogo> findAllById(Integer id);

    public List<Jogo> findByData(String data);

    public List<Jogo> findByTime1(Integer id);
}
