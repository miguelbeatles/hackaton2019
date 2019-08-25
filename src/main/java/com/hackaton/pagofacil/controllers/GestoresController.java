package com.hackaton.pagofacil.controllers;

import com.hackaton.pagofacil.beans.HistorialGps;
import com.hackaton.pagofacil.repositories.HistorialGpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.UUID;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@RestController
public class GestoresController {

    @Autowired
    private HistorialGpsRepository repository;




    @PostMapping("/gestores/ubicacion")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<HistorialGps> createGPS(@RequestBody HistorialGps historial){
        return new ResponseEntity<>(repository.save(historial), HttpStatus.CREATED);
    }


}
