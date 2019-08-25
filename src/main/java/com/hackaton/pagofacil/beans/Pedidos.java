package com.hackaton.pagofacil.beans;

import java.text.NumberFormat;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
public class Pedidos {

    private Integer idPedido;
    private String descripcion;
    private Double saldo;
    private Double abonado;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getAbonado() {
        return abonado;
    }

    public void setAbonado(Double abonado) {
        this.abonado = abonado;
    }
}
