package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ---- Ejercicio 1 -----

        // Crear de forma aleatoria el sistema para probar el programa

        CreacionDirectorios creacionDirectorios = new CreacionDirectorios();
        creacionDirectorios.aleatorio();
        List<Directorio> sistema = creacionDirectorios.getSistema();

        creacionDirectorios.mostrarDirectoriosRecursivo(sistema);
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es el nombre del proyecto?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cuántas tareas iniciales tendrá el proyecto?");
        int numTareas = scanner.nextInt();

        TareaRecursiva proyecto = new TareaRecursiva();
        List<Tarea> tareas = proyecto.crearTareaRecursiva(nombre, numTareas);

        System.out.println("Proyecto: " + nombre);
        proyecto.mostrarProyecto(tareas, "");
    }
}