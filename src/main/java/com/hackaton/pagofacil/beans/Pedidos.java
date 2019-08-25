package com.hackaton.pagofacil.beans;

import java.text.NumberFormat;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
public class Pedidos {

    private Integer idPedido;
    private String descripcion;
    private Integer saldo;
    private Integer abonado;

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

    public String getSaldo(){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(0);
        return format.format(saldo);
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getAbonado() {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(0);
        return format.format(abonado);
    }

    public void setAbonado(Integer abonado) {
        this.abonado = abonado;
    }
}
