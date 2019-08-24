package com.hackaton.pagofacil;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@Document(collection = "Clientes")
public class Cliente {

    private String _id;
    private String nombre;
    private String apellidom;
    private String apellidop;
    private Integer visitas;
    private Double saldo;
    private Double moras;
    private Domicilio domicilio;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public Integer getVisitas() {
        return visitas;
    }

    public void setVisitas(Integer visitas) {
        this.visitas = visitas;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getMoras() {
        return moras;
    }

    public void setMoras(Double moras) {
        this.moras = moras;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
