package com.timing.teste.services;

import com.timing.teste.domain.Cidade;
import com.timing.teste.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository repository;

    public void insereCidade(Cidade cidade){
        repository.save(cidade);
    }

    public List<Cidade> listaTodasCidades(){
        return  repository.findAll();
    }

    public List<Cidade> buscaPorUf(String uf){
        return  repository.findByUf(uf);
    }

}
