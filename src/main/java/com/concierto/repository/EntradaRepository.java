package com.concierto.repository;

import com.concierto.entity.Entrada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wmora
 */
@Repository
public interface EntradaRepository extends CrudRepository<Entrada,Long>{
    
}
