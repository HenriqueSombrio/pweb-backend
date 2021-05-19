package com.timing.teste.repository;

import com.timing.teste.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    public List<Cliente> findByNomeLike(String nome);
}
