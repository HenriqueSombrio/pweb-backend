package com.timing.teste.services;

import com.timing.teste.domain.Cliente;
import com.timing.teste.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public Cliente insereCliente(Cliente cliente){
        return repository.save(cliente);
    }

    public Cliente editarCliente(Cliente clienteUpdate, Integer id) {
        Assert.notNull(id, "Não foi possível atualizar a cidade");
        Optional<Cliente> clienteOptional = repository.findById(id);

        if (clienteOptional.isPresent()){
            Cliente clienteConsultado = clienteOptional.get();
            clienteConsultado.setNome(clienteUpdate.getNome());
            clienteConsultado.setSaldo(clienteUpdate.getSaldo());
            clienteConsultado.setCidade(clienteUpdate.getCidade());

            repository.save(clienteConsultado);
            return clienteConsultado;
        } else {
            return null;
        }

    }

    public boolean excluirCliente(Integer id){
        Optional<Cliente> clienteOptional = repository.findById(id);

        if (clienteOptional.isPresent()){
            repository.deleteById(id);

            return true;
        }

        return false;
    }

    public List<Cliente> listaTodosClientes(){
        return  repository.findAll();
    }

    public List<Cliente> filtraPorNome(String nome){
        return repository.findByNomeLike(nome+"%");
    }
}
