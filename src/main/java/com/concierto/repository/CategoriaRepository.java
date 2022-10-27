package com.concierto.repository;

import com.concierto.entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wmora
 */
@Repository
public interface CategoriaRepository extends CrudRepository<Categoria,Long>{
    
}
