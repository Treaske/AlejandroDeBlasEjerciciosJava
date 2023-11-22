/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosclase13.logica;

import com.mycompany.ejerciciosclase13.persistencia.ControladoraPersistencia;
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
}
