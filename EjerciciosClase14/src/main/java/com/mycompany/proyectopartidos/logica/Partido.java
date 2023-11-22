/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopartidos.logica;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author alexd
 */

@Entity
public class Partido implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    
    @ManyToOne
    @JoinColumn(name = "EquipoLocal")
    private Equipo local;
    
    @ManyToOne
    @JoinColumn(name = "EquipoVisitante")
    private Equipo visitante;
    
    private int resLocal;
    private int resVisitante;

    public Partido() {
    }

    public Partido(Long id, String fecha, Equipo local, Equipo visitante, int resLocal, int resVisitante) {
        this.id = id;
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.resLocal = resLocal;
        this.resVisitante = resVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }
    
    public String getLocalNombre() {
        return local.getNombre();
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }
    
    public String getVisitanteNombre() {
        return visitante.getNombre();
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getResLocal() {
        return resLocal;
    }

    public void setResLocal(int resLocal) {
        this.resLocal = resLocal;
    }

    public int getResVisitante() {
        return resVisitante;
    }

    public void setResVisitante(int resVisitante) {
        this.resVisitante = resVisitante;
    }
    
    
    
    
  
}
