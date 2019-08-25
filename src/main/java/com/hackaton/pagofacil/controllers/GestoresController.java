package com.hackaton.pagofacil.controllers;

import com.hackaton.pagofacil.beans.Gestores;
import com.hackaton.pagofacil.beans.HistorialGps;
import com.hackaton.pagofacil.repositories.GestoresRepository;
import com.hackaton.pagofacil.repositories.HistorialGpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@RestController
@RequestMapping("/gestores")
public class GestoresController {

    @Autowired
    private HistorialGpsRepository repository;

    @Autowired
    private GestoresRepository gestoresRepository;

    @GetMapping()
    public Iterable<Gestores> getAll(){
        return gestoresRepository.findAll();

    }

    @GetMapping
    @RequestMapping("/{id}")
    public Optional<Gestores> getById(@PathVariable("id") String id){
        return gestoresRepository.findById(id);
    }


    @PostMapping("ubicacion")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<HistorialGps> createGPS(@RequestBody HistorialGps historial){
        return new ResponseEntity<>(repository.save(historial), HttpStatus.CREATED);
    }


}
