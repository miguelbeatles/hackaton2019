package com.hackaton.pagofacil.service;

import com.fasterxml.jackson.databind.BeanProperty;
import com.hackaton.pagofacil.beans.Gestores;
import com.hackaton.pagofacil.json.DistanceMatrixResponse;
import com.hackaton.pagofacil.util.Constants;
import org.apache.tomcat.util.bcel.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class GestoresCercanosService {

    public final Logger logger = LoggerFactory.getLogger(GestoresCercanosService.class);

    public  Gestores estaCerca(Gestores gestor,String latitud,String longitud){
        String url = Constants.API_DISTANCE_MATRIX
                .replace("{0}",latitud).replace("{1}", longitud)
                .replace("{2}", gestor.getLatitud().toString()).replace("{3}",gestor.getLongitud().toString());

        logger.info(url);

        RestTemplate restTemplate = new RestTemplate();
        DistanceMatrixResponse distance = restTemplate.getForObject(url,DistanceMatrixResponse.class);
        Integer distancia =  Integer.parseInt(distance.getRows()[0].getElements()[0].getDistance().getValue());
        if(distancia <= Constants.RADIO_COBERTURA) {
            logger.info("distancia = "+distancia);
            gestor.setDistancia(distancia);
            return gestor;
        }

        return null;

    }
}
