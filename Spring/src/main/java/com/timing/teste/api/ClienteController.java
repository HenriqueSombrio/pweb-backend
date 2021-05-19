package com.timing.teste.api;

import com.timing.teste.domain.Cliente;
import com.timing.teste.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService service;

    @PostMapping
    private Cliente cadastraCliente(@RequestBody Cliente cliente){
      return service.insereCliente(cliente);
    }

    @GetMapping
    public List<Cliente> listaTodos(){
        return service.listaTodosClientes();
    }

    @GetMapping("/{filtro}")
    public List<Cliente> filtraPorNome(@PathVariable("filtro") String filtro){
        return service.filtraPorNome(filtro);
    }

    @PutMapping("/{id}")
    public Cliente editarCliente(@PathVariable("id") Integer id, @RequestBody Cliente dadosCliente){
        Cliente editado = service.editarCliente(dadosCliente, id);

        if (editado != null){
            return editado;
        } else
            return null;
    }

    @DeleteMapping("/{id}")
    public boolean deletarCliente(@PathVariable("id") Integer id) {
        return service.excluirCliente(id);
    }
}
