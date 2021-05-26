package com.example.exerciciotimes.api;

import com.example.exerciciotimes.domain.Jogo;
import com.example.exerciciotimes.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogo")
public class JogoController {
    @Autowired
    JogoService service;

    @PostMapping
    private Jogo cadastrarJogo(@RequestBody Jogo jogo){
        return service.cadastrarJogo(jogo);
    }

    @GetMapping("/{data}")
    public List<Jogo> filtrarPorData(@PathVariable(name = "data") String data){
        return service.filtrarPorData(data);
    }

    @GetMapping("/{time}")
    public List<Jogo> filtrarPorTime(@PathVariable(name = "time") Srting time){
        return service.
    }
}
