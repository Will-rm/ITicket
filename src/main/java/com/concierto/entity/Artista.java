package com.concierto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author wmora
 */

@Entity
@Table(name = "artista")
public class Artista implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero_artista;
    private String nombre;
    private String apellido1;
    private String apellido2;
     private String fecha;
    private String lugar;

    public long getNumero_artista() {
        return numero_artista;
    }

    public void setNumero_artista(long numero_artista) {
        this.numero_artista = numero_artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
