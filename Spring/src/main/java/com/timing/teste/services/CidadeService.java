package com.timing.teste.services;

import com.timing.teste.domain.Cidade;
import com.timing.teste.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository repository;

    public Cidade insereCidade(Cidade cidade){
        return repository.save(cidade);
    }

    public Cidade editarCidade(Cidade cidadeUpdate, Integer id) {
        Assert.notNull(id, "Não foi possível atualizar a cidade");
        Optional<Cidade> cidadeOptional = repository.findById(id);

        if (cidadeOptional.isPresent()){
            Cidade cidadeConsultada = cidadeOptional.get();
            cidadeConsultada.setNome(cidadeUpdate.getNome());
            cidadeConsultada.setUf(cidadeUpdate.getUf());

            repository.save(cidadeConsultada);
            return cidadeConsultada;
        } else {
            return null;
        }

    }

    public boolean excluirCidade(Integer id){
        Optional<Cidade> cidadeOptional = repository.findById(id);

        if (cidadeOptional.isPresent()){
            repository.deleteById(id);

            return true;
        }

        return false;
    }

    public List<Cidade> listaTodasCidades(){
        return  repository.findAll();
    }

    public List<Cidade> buscaPorUf(String uf){
        return  repository.findByUf(uf);
    }

}
