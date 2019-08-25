package com.hackaton.pagofacil.repositories;

import com.hackaton.pagofacil.beans.HistorialGps;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.CrudRepository;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@Document(collection = "HistorialGPS")
public interface HistorialGpsRepository extends CrudRepository<HistorialGps, String> {
}
