package com.hackaton.pagofacil.controllers;

import com.hackaton.pagofacil.beans.Gestores;
import com.hackaton.pagofacil.beans.HistorialGps;
import com.hackaton.pagofacil.repositories.GestoresRepository;
import com.hackaton.pagofacil.repositories.HistorialGpsRepository;
import com.hackaton.pagofacil.service.GestoresCercanosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@RestController
@RequestMapping("/gestores")
public class GestoresController {

    public final Logger logger = LoggerFactory.getLogger(GestoresController.class);

    @Autowired
    private HistorialGpsRepository repository;
    @Autowired
    private GestoresCercanosService gestoresCercanosService;

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

    @GetMapping("/cercanos")
    public List<Gestores> infoCliente(@RequestParam("latitud") String latitud,
                                      @RequestParam("longitud") String longitud) {

        Stream<Gestores> stream = StreamSupport.stream(gestoresRepository.findAll().spliterator(), false);
        return stream.filter(gestor -> gestoresCercanosService.estaCerca(gestor,latitud,longitud) != null)
                .sorted(Comparator.comparingInt(Gestores::getDistancia))
                .collect(Collectors.toList());

    }


}
