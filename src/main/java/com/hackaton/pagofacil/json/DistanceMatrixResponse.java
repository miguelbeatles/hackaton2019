package com.hackaton.pagofacil.json;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DistanceMatrixResponse {
    private String[] destination_addresses;
    private String[] origin_addresses;
    private Rows[] rows;
    private String status;

    public Rows[] getRows() {
        return rows;
    }

    @Override
    public String toString() {
        return "DistanceMatrixResponse{" +
                "destination_addresses=" + Arrays.toString(destination_addresses) +
                ", origin_addresses=" + Arrays.toString(origin_addresses) +
                ", rows=" + Arrays.toString(rows) +
                ", status='" + status + '\'' +
                '}';
    }
}
/*
*
*
* {
   "destination_addresses" : [ "New York, NY, USA" ],
   "origin_addresses" : [ "Washington, DC, USA" ],
   "rows" : [
      {
         "elements" : [
            {
               "distance" : {
                  "text" : "225 mi",
                  "value" : 361715
               },
               "duration" : {
                  "text" : "3 hours 49 mins",
                  "value" : 13725
               },
               "status" : "OK"
            }
         ]
      }
   ],
   "status" : "OK"
}
*
*
* */