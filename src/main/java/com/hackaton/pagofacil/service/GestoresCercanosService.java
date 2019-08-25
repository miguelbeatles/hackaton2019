package com.hackaton.pagofacil.service;

import com.hackaton.pagofacil.beans.Gestores;
import com.hackaton.pagofacil.json.DistanceMatrixResponse;
import com.hackaton.pagofacil.util.Constants;
import org.apache.tomcat.util.bcel.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class GestoresCercanosService {
    private final String origins="origins=";
    private final String destinations="destinations=";
    private final String key="key="+ Constants.API_KEY;

    public final Logger logger = LoggerFactory.getLogger(GestoresCercanosService.class);

    public List<Gestores> obtenerGestoresCercanos(){
        List<Gestores> gestoresCercanos = new ArrayList<>();
        try{

            RestTemplate restTemplate = new RestTemplate();
            DistanceMatrixResponse distance = restTemplate
                    .getForObject(Constants.API_DISTANCE_MATRIX +"&"
                            +origins+"&"
                            +destinations+"&"+
                            key,
                            DistanceMatrixResponse.class);
        }catch (Exception e){
            logger.info("Ocurrio un error buscando Gestores cercanos");
        }

        return gestoresCercanos;
    }
}
