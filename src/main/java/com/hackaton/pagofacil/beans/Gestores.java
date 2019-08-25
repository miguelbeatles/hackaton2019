package com.hackaton.pagofacil.beans;

import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@Document(collection = "Gestores")
public class Gestores {

    private String _id;
    private String numeroEmpleado;
    private String nombre;
    private String apellidoM;
    private String apellidoP;
    private String foto;
    private BigDecimal latitud;
    private BigDecimal longitud;
    private Integer distancia;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre + " " + apellidoP + " " + apellidoM;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Gestores{" +
                "_id='" + _id + '\'' +
                ", numeroEmpleado='" + numeroEmpleado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoM='" + apellidoM + '\'' +
                ", apellidoP='" + apellidoP + '\'' +
                ", foto='" + foto + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", distancia=" + distancia +
                '}';
    }
}
