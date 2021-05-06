package com.timing.teste.services;

import com.timing.teste.domain.Pessoa;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    public Pessoa buscaPorId(int id){
        List<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(new Pessoa(1, "Henrique", 24));
        lista.add((new Pessoa(2, "Larissa", 20)));
        lista.add(new Pessoa(3, "Wendel", 1));

        if (id == 1)
            return lista.get(0);
        if (id==2)
            return lista.get(1);
        if (id==3)
            return lista.get((2));

        return null;
    }
}
