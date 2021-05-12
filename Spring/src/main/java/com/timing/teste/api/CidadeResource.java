package com.timing.teste.api;

import com.timing.teste.domain.Cidade;
import com.timing.teste.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {

    @Autowired
    CidadeService service;

    @PostMapping
    public void cadastraCidade(@RequestBody Cidade cidade){
        service.insereCidade(cidade);
    }

    @GetMapping
    public List<Cidade> listaTodas(){
      return service.listaTodasCidades();
    }

    @GetMapping("/{uf}")
    public List<Cidade> buscaPorUf(@PathVariable(name="uf") String uf){
        return service.buscaPorUf(uf);
    }
}
