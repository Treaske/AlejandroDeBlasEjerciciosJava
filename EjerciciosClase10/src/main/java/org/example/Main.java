package org.example;

import java.sql.SQLClientInfoException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /* ----- Ejercicio 1 -----

        Empleado emp1 = new Empleado("Juan", 2000, "Desarrollador");
        Empleado emp2 = new Empleado("Marta", 3000, "Analista");
        Empleado emp3 = new Empleado("Sandra", 2500, "Desarrollador");
        Empleado emp4 = new Empleado("Alex", 1000, "Analista");
        Empleado emp5 = new Empleado("Antonio", 5000, "Gerente");

        List<Empleado> empleados = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        List<Empleado> empleadosFiltradosSalario = empleados.stream()
                .filter(e -> e.getSalario() > 2000) //filtrar los empleados que tengan mayor salario de 2000
                .toList();

        System.out.println("--Salario mayor a 2000--");
        empleadosFiltradosSalario.forEach(System.out::println);

        //Medias de Salario

        OptionalDouble promedioDesarrollador = empleados.stream()
                .mapToDouble(n->n.getSalario())
                .average();

        OptionalDouble promedioAnalista = empleados.stream()
                .mapToDouble(n->n.getSalario())
                .average();

        OptionalDouble promedioGerente = empleados.stream()
                .mapToDouble(n->n.getSalario())
                .average();

        System.out.println("\nPromedios de salario");
        System.out.println(" Desarrolladores: " + promedioDesarrollador);
        System.out.println(" Analistas: " + promedioDesarrollador);
        System.out.println(" Gerente: " + promedioDesarrollador);

        System.out.println("\nEmpleado con mayor salario");

        Optional<Empleado> optionalEmpleado = empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));

        System.out.println(" " + optionalEmpleado);

         */


        Evento even1 = new Evento("Conf. Lucas", LocalDate.of(2012, 8, 12), "Conferencia");
        Evento even2 = new Evento("Reun. Martin", LocalDate.of(2012, 9, 7) , "Reunion");
        Evento even3 = new Evento("Conf. Marta", LocalDate.of(2012, 8, 12), "Conferencia");
        Evento even4 = new Evento("Reun. Juan", LocalDate.of(2012, 9, 22) , "Reunion");
        Evento even5 = new Evento("Tall. Alex", LocalDate.of(2012, 10, 16), "Taller");

        List<Evento> eventos = Arrays.asList(even1, even2, even3, even4, even5);

        LocalDate fechaEspecifica = LocalDate.of(2012, 8, 12);
        List<Evento> eventoFecha = eventos.stream()
                .filter(evento -> evento.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());

        System.out.println("--Eventos en fecha " + fechaEspecifica);
        eventoFecha.forEach(System.out::println);

        // Eventos por categorias
        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

        System.out.println("\nNúmero de eventos por categoría:");
        eventosPorCategoria.forEach((categoria, cantidad) ->
                System.out.println(categoria + ": " + cantidad + " eventos"));

        // Encontrar el evento más próximo en el tiempo
        LocalDate fechaActual = LocalDate.of(2023, 11, 14);
        Optional<Evento> eventoProximo = eventos.stream()
                .min((e1, e2) -> (int) ChronoUnit.DAYS.between(fechaActual, e1.getFecha()) -
                        (int) ChronoUnit.DAYS.between(fechaActual, e2.getFecha()));

        System.out.println("\nEl siguiente evento es: " + eventoProximo);

    }
}