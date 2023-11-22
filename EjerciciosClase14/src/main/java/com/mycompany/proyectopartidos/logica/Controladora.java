/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopartidos.logica;

import com.mycompany.proyectopartidos.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author alexd
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPartido (Partido parti) {
        controlPersis.crearPartido(parti);
    }
    
    public void eliminarPartido (Long id) {
        controlPersis.eliminarPartido(id);
    }
    
    public List<Partido> traerPartido () {
        return controlPersis.traerPartido();
    }
    
    public Partido getPartido (String nombre) {
        return controlPersis.getPartido(nombre);
    }
    
    public void editarPartido (Partido parti) {
        controlPersis.editarPartido(parti);
    }
    
    
    
    public void crearEquipo (Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }
    
    public void eliminarEquipo (Long id) {
        controlPersis.eliminarEquipo(id);
    }
    
    public List<Equipo> traerEquipo () {
        return controlPersis.traerEquipo();
    }
    
    public Equipo findEquipo(Long id){
        return controlPersis.findEquipo(id);
    }
    
    public Equipo getEquipo (String nombre) {
        return controlPersis.getEquipo(nombre);
    }
    
    public void editarEquipo (Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }
}
