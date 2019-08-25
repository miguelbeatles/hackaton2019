package com.hackaton.pagofacil.controllers;

import com.hackaton.pagofacil.beans.Cliente;
import com.hackaton.pagofacil.beans.Gestores;
import com.hackaton.pagofacil.beans.HistorialGps;
import com.hackaton.pagofacil.json.DistanceMatrixResponse;
import com.hackaton.pagofacil.repositories.GestoresRepository;
import com.hackaton.pagofacil.repositories.HistorialGpsRepository;
import com.hackaton.pagofacil.service.GestoresCercanosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

// http://10.0.15.119:8080/gestores/cercanos?latitud=126516256125&longitud=1223243
    //@GetMapping("/cercanos")
    @RequestMapping(value = "/cercanos", method = RequestMethod.GET)
    public List<Gestores> infoCliente(@RequestParam("latitud") String latitud,@RequestParam("longitud") String longitud) {
        List<Gestores> gestoresCercanos = new ArrayList<>();
        Iterable<Gestores> gestores = null;
        logger.info("-----------------------------");
        try{
            gestores = gestoresRepository.findAll();
            gestores.forEach(gestor -> {
                if(gestoresCercanosService.estaCerca(gestor,latitud,longitud)){
                    gestoresCercanos.add(gestor);
                }
            });
        }catch (Exception e){
            logger.info("Ocurrio un error al buscar los gestores {}",e);
        }
        return gestoresCercanos;
    }


}
