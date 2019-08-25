package com.hackaton.pagofacil.beans;

import java.util.Date;
import java.util.List;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
public class HistorialGps {

    private String _id;
    private String numeroEmpleado;
    private Date fecha;
    private List<PuntoGps> historial;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<PuntoGps> getHistorial() {
        return historial;
    }

    public void setHistorial(List<PuntoGps> historial) {
        this.historial = historial;
    }
}
