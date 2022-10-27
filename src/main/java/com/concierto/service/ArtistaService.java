/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concierto.service;

import com.concierto.entity.Artista;
import com.concierto.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author wmora
 */
public class ArtistaService implements IArtistaService{

    @Autowired
    private ArtistaRepository artistaRepository;
    
    @Override
    public List<Artista> getAllArtista() {
    return (List<Artista>) artistaRepository.findAll();
    }

    @Override
    public Artista getArtistaById(Long numero_artista) {
         return artistaRepository.findById(numero_artista).orElse(null);
    }
    
    @Override
    public void saveArtista(Artista artista) {
        artistaRepository.save(artista);
    }

    @Override
    public void delete(long numero_artista) {
       artistaRepository.deleteById(numero_artista);
    }
    
}
