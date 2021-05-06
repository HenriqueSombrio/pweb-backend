package com.timing.teste.api;

import com.timing.teste.domain.Pessoa;
import com.timing.teste.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaService service;

    @GetMapping
    public List<Pessoa> listaTodas(){
        return service.listaPessoa();
    }

    @GetMapping("/id/{id}")
    public Pessoa listaPorId(@PathVariable(name = "id") int id){
        return service.buscaPorId(id);
    }

    @PostMapping
    public String mostraNovaPessoa(@RequestBody Pessoa novaPessoa){
        return novaPessoa.toString();
    }
}
