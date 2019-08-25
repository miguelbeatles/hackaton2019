package com.hackaton.pagofacil.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    private String text;
    private String value;

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "text:'" + text + '\'' +
                ", value:'" + value + '\'' +
                '}';
    }
}
