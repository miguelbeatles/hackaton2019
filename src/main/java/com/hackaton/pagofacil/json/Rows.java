package com.hackaton.pagofacil.json;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Arrays;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rows {
    private Element[] elements;

    public Element[] getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "Rows{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
