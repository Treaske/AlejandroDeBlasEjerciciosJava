/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosclase13.persistencia;

import com.mycompany.ejerciciosclase13.logica.Partido;
import com.mycompany.ejerciciosclase13.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexd
 */
public class ControladoraPersistencia {
    
    PartidoJpaController partiJPA = new PartidoJpaController();
    
    public void crearPartido (Partido perso) {
        partiJPA.create(perso);
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
    
}
