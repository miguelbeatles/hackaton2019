package com.hackaton.pagofacil.repositories;

import com.hackaton.pagofacil.beans.Gestores;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Creado por  Ascari Q. Romo Pedraza - molder.itp@gmail.com on 2019-08-24.
 */
@Component
public interface GestoresRepository extends CrudRepository<Gestores,String> {
}
