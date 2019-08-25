package com.hackaton.pagofacil.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Arrays;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Element {
    private Item distance;
    private Item duration;
    private String status;

    public Item getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "{" +
                "distance=" + distance +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }
}
