/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.concierto.service;

import com.concierto.entity.Artista;
import java.util.List;

/**
 *
 * @author wmora
 */
public interface IArtistaService {
     public List<Artista> getAllArtista();
    public Artista getArtistaById(Long numero_artista);
    public void saveArtista(Artista artista);
    public void delete (long numero_artista);
}
