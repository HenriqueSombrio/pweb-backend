package com.example.exerciciotimes.api;

import com.example.exerciciotimes.domain.Time;
import com.example.exerciciotimes.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times")
public class TimeController {
    @Autowired
    TimeService service;

    @PostMapping
    public void cadastrarTime(@RequestBody Time time){
        service.cadastrarTime(time);
    }

    @GetMapping
    public List<Time> listarTodos(){
        return service.listarTodosTimes();
    }

    @PutMapping("/{id}")
    public Time editarTime(@PathVariable("id") Integer id,@RequestBody Time dadostime){
        Time editTime = service.editarTime(dadostime, id);

        if (editTime != null){
            return editTime;
        } else {
            return null;
        }
    }
}
