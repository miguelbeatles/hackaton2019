package com.hackaton.pagofacil.controllers;

import com.hackaton.pagofacil.beans.Cliente;
import com.hackaton.pagofacil.json.DistanceMatrixResponse;
import com.hackaton.pagofacil.repositories.ClienteRepository;
import com.hackaton.pagofacil.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public Iterable<Cliente> listClientes(){

        return clienteRepository.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> infoCliente(@PathVariable("id") String id){
        return clienteRepository.findById(id);
    }


//Italika torre area   lat 19.309339,long -99.187090
//quarry studios           19.303161,     -99.164385      |cliente|
}
