package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreacionDirectorios <T extends Directorio>{
    private List<Directorio> sistema = new ArrayList<>();

    public void aleatorio() {

        // creacion aleatoria del sistema con los 7 directorios principales pero despues se añaden subdirectorios y archivos aleatorios

        String[] directorios = {"Escritorio", "Descargas", "Imagenes", "Juegos", "Proyectos", "Personal", "Usuario"};
        Random random = new Random();

        for (int i = 0; i < directorios.length; i++) {
            Directorio direc = new Directorio();
            direc.setNombre(directorios[i]);

            int numDirec = random.nextInt(6) + 1;
            List<Directorio> subdirectorios = new ArrayList<>();

            for (int j = 0; j < numDirec; j++) {
                subdirectorios.add(añadirSubdirec(j, direc.getNombre()));
            }

            direc.setSubdirectorios(subdirectorios);
            sistema.add(direc);
        }
    }

    public Directorio añadirSubdirec(int j, String nombre){
        Directorio directorio = new Directorio();
        Random random = new Random();
        int numAlea = 0;
        List<String> archivos = new ArrayList<>();

        directorio.setNombre("|---Subdirectorio" + nombre + j);

        List<Directorio> subdirectorios = new ArrayList<>();

        numAlea = random.nextInt(5);
        for (int f = 0; f < numAlea; f++) {
            subdirectorios.add(añadirSubSubdirec(j, directorio.getNombre()));;
        }
        directorio.setSubdirectorios(subdirectorios);

        numAlea = random.nextInt(5);
        for (int i = 0; i < 2; i++) {
            archivos.add("Archivo" + i);
        }
        directorio.setArchivos(archivos);

        return directorio;
    }

    public Directorio añadirSubSubdirec(int j, String nombre){
        Directorio directorio = new Directorio();

        directorio.setNombre("   " + nombre + "-Carpeta");
        return directorio;
    }
    public void mostrarDirectoriosRecursivo(List<Directorio> directorios){
        for (Directorio directorio : directorios) {
            System.out.println(directorio.getNombre());

            List<Directorio> subdirectorios = directorio.getSubdirectorios();
            //guarda en subdirectorios la lista de directorios y comprueba si esta vacia para llamar de forma recursiva a la misma funcion
            if (subdirectorios != null && !subdirectorios.isEmpty()) {
                mostrarDirectoriosRecursivo(subdirectorios);
            }

            List<String> archivos = directorio.getArchivos();
            if (archivos != null && !archivos.isEmpty()) {
                archivos.forEach(archivo -> System.out.println("   " + archivo));
            }
        }
    }

    public List<Directorio> getSistema() {
        return sistema;
    }
}
