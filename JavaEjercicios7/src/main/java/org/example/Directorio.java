package org.example;

import java.util.List;

public class Directorio {
    private String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    public Directorio() {
    }

    public Directorio(String nombre, List<Directorio> subdirectorios, List<String> archivos) {
        this.nombre = nombre;
        this.subdirectorios = subdirectorios;
        this.archivos = archivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return nombre + subdirectorios;
    }
}
