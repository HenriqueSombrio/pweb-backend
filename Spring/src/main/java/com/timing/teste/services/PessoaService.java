package com.timing.teste.services;

import com.timing.teste.domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {
    public List<Pessoa> listaPessoa(){
        List<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(new Pessoa(1, "Henrique", 24));
        lista.add((new Pessoa(2, "Larissa", 20)));
        lista.add(new Pessoa(3, "Wendel", 1));

        return lista;
    }
}
