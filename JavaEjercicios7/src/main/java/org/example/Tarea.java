package org.example;

import java.util.List;

public class Tarea {

    private String nombre;
    private List<Tarea> subtarea;

    public Tarea() {
    }

    public Tarea(String nombre, List<Tarea> subtarea) {
        this.nombre = nombre;
        this.subtarea = subtarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtarea() {
        return subtarea;
    }

    public void setSubtarea(List<Tarea> subtarea) {
        this.subtarea = subtarea;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", subtarea=" + subtarea +
                '}';
    }
}
