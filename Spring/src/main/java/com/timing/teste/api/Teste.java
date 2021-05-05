package com.timing.teste.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Teste {
    @GetMapping
    public String inicial(){
        return "Olá bem vindo a api";
    }
    @GetMapping("/ola/{idade}/{nome}")
    public  String novo(@PathVariable(name = "idade") String idade, @PathVariable(name = "nome") String nome){
        return "Ola, "+nome+" você tem "+idade+" anos";
    }
}
