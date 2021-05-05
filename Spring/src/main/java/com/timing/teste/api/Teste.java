package com.timing.teste.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Teste {
    @GetMapping
    public String inicial(){
        return "Olá bem vindo a api";
    }
    @GetMapping("/ola")
    public  String novo(){
        return "Ola 2";
    }
}
