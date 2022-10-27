/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concierto.service;

import com.concierto.entity.Categoria;
import com.concierto.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author wmora
 */
public class CategoriaService implements ICategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Override
    public List<Categoria> getAllCategoria() {
         return (List<Categoria>) categoriaRepository.findAll();
    }

    @Override
    public Categoria getCategoriaById(Long id_categoria) {
       return categoriaRepository.findById(id_categoria).orElse(null);
    }

    @Override
    public void saveCategoria(Categoria categoria) {
       categoriaRepository.save(categoria);
    }

    @Override
    public void delete(long id_categoria) {
       categoriaRepository.deleteById(id_categoria);
    }
    
}
