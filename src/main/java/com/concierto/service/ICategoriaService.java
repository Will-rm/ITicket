/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.concierto.service;

import com.concierto.entity.Categoria;
import java.util.List;

/**
 *
 * @author wmora
 */
public interface ICategoriaService {
    public List<Categoria> getAllCategoria();
    public Categoria getCategoriaById(Long id_categoria);
    public void saveCategoria(Categoria categoria);
    public void delete (long id_categoria);
}
