/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopartidos.persistencia;

import com.mycompany.proyectopartidos.logica.Equipo;
import com.mycompany.proyectopartidos.logica.Partido;
import com.mycompany.proyectopartidos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexd
 */
public class ControladoraPersistencia {
    PartidoJpaController partiJPA = new PartidoJpaController();
    EquipoJpaController equipoJPA = new EquipoJpaController();
    
    public void crearPartido (Partido parti) {
        partiJPA.create(parti);
    }
    
    public void eliminarPartido (Long id) {
        try {
            partiJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Partido> traerPartido () {
    return partiJPA.findPartidoEntities();
    }
    
    public Partido getPartido (String nombre) {
        return partiJPA.findPartidoNombre(nombre);
    }
    
    public void editarPartido (Partido parti) {
        try {
            partiJPA.edit(parti);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void crearEquipo (Equipo equipo) {
        equipoJPA.create(equipo);
    }
    
    public void eliminarEquipo (Long id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Equipo> traerEquipo () {
    return equipoJPA.findEquipoEntities();
    }
    
    public Equipo getEquipo (String nombre) {
        return equipoJPA.findEquipoNombre(nombre);
    }
    
    public Equipo findEquipo (Long id) {
        return equipoJPA.findEquipo(id);
    }
    
    public void editarEquipo (Equipo equipo) {
        try {
            equipoJPA.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
