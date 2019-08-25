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
    private final String COMA=",";
    private final String PIPE="|";

    public final Logger logger = LoggerFactory.getLogger(GestoresCercanosService.class);

    public  boolean estaCerca(Gestores gestor,String latitud,String longitud){
        boolean estaCerca=false;
        try{
            String url = Constants.API_DISTANCE_MATRIX +"&"
                    +origins+       latitud+          COMA+ longitud +"&"
                    +destinations+gestor.getLatitud()+COMA+gestor.getLongitud()+"&"+
                    key;
            logger.info(url);
            RestTemplate restTemplate = new RestTemplate();
            DistanceMatrixResponse distance = restTemplate
                    .getForObject(url,
                            DistanceMatrixResponse.class);
            if(distance != null){
                String distancia =  distance.getRows()[0].getElements()[0].getDistance().getValue();
                if(Integer.parseInt(distancia) <= Constants.RADIO_COBERTURA)
                    estaCerca=true;
            }
        }catch (Exception e){
            logger.info("Ocurrio un error buscando Gestores cercanos {}",e);
        }

        return estaCerca;
    }
}
