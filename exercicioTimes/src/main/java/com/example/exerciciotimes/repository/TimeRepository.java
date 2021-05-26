package com.example.exerciciotimes.repository;

import com.example.exerciciotimes.domain.Time;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TimeRepository extends JpaRepository<Time, Integer> {
    public List<Time> findByPais(String pais);

    Optional<Time> findById(Integer id);
}
