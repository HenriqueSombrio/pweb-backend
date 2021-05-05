package com.timing.teste.services;

import com.timing.teste.domain.Carro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {
    public List<Carro> listaCarros(){
        List<Carro> lista = new ArrayList<Carro>();
        lista.add(new Carro(1, "Fusca", 1986));
        lista.add((new Carro(2, "Brasilia", 1987)));
        lista.add(new Carro(3, "Belina", 1988));

        return lista;
    }
}
