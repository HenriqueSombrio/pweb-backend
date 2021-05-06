package com.timing.teste.api;

import com.timing.teste.domain.Carro;
import com.timing.teste.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    CarroService service;

    @GetMapping
    public List<Carro> listaCarros(){
        return service.listaCarros();
    }


}
