package com.example.exerciciotimes.services;

import com.example.exerciciotimes.domain.Time;
import com.example.exerciciotimes.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class TimeService {

    @Autowired
    TimeRepository repository;

    public Time cadastrarTime(Time time) {
        return repository.save(time);
    }

    public Time editarTime(Time timeUpdate, Integer id){
        Assert.notNull(id, "Não possível atualizar o time");
        Optional<Time> timeOptional = repository.findById(id);

        if (timeOptional.isPresent()){
            Time timeConsultado = timeOptional.get();
            timeConsultado.setPais(timeUpdate.getPais());
            timeConsultado.setContinente(timeUpdate.getContinente());

            repository.save(timeConsultado);
            return timeConsultado;
        } else {
            return null;
        }
    }

    public List<Time> listarTodosTimes() {return repository.findAll();}
}
