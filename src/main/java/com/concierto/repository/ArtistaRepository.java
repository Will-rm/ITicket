package com.concierto.repository;

import com.concierto.entity.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wmora
 */
@Repository
public interface ArtistaRepository extends CrudRepository<Artista,Long>{
    
}
