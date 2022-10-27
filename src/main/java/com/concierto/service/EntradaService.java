/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concierto.service;

import com.concierto.entity.Entrada;
import com.concierto.repository.EntradaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author wmora
 */
public class EntradaService implements IEntradaService{

    @Autowired
    private EntradaRepository entradaRepository;
    
    @Override
    public List<Entrada> listEntradas() {
        return (List<Entrada>) entradaRepository.findAll();
    }
    
}
