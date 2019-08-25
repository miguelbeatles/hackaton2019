package com.hackaton.pagofacil.controllers;

import com.hackaton.pagofacil.beans.Cliente;
import com.hackaton.pagofacil.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping("/clientes")
    public Iterable<Cliente> listClientes(){

        return repository.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> infoCliente(@PathVariable("id") String id){
        return repository.findById(id);
    }

}
