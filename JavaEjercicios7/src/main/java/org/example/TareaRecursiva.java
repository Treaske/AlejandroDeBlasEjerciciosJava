package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TareaRecursiva extends Tarea {
    public List<Tarea> crearTareaRecursiva(String nombre, int numeroTareas) {
        List<Tarea> tareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeroTareas; i++) {
            System.out.println("Nombre de la tarea " + (i + 1) + ":");
            String nombreTarea = scanner.nextLine();

            Tarea tarea = new Tarea();
            tarea.setNombre(nombreTarea);

            System.out.println("¿Cuántas subtareas tendrá la tarea " + nombreTarea + "?");
            int cont = scanner.nextInt();
            //Limpiamos el escaner ya que si no daria error al pedir otro nextLine(problema del nextInt que no guarda el salto de linea)
            scanner.nextLine();

            List<Tarea> subtareas = new ArrayList<>();
            if (cont <= 0) {
                System.out.println("Sin subtareas");
            } else {
                System.out.println("Agregando subtareas a " + nombreTarea + ":");
                subtareas.addAll(crearTareaRecursiva(nombreTarea, cont));
            }
            tarea.setSubtarea(subtareas);
            tareas.add(tarea);
        }
        return tareas;
    }

    public void mostrarProyecto(List<Tarea> tareas, String prefijo) {
        for (Tarea tarea : tareas) {
            System.out.println(prefijo + "Tarea: " + tarea.getNombre());

            List<Tarea> subtareas = tarea.getSubtarea();
            if (!subtareas.isEmpty()) {
                //prefijo para la parte de mostrar mediante asci
                mostrarProyecto(subtareas, prefijo + "|-- ");
            }
        }
    }
}
