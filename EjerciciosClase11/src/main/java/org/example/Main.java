package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*

        Auto even1 = new Auto("Audi", "Modelo5", 2002,21000);
        Auto even2 = new Auto("Toyota", "Modelo1", 2009,98000);
        Auto even3 = new Auto("BMW", "Modelo3", 2019, 32000);
        Auto even4 = new Auto("Seat", "Modelo8", 2001, 45000);
        Auto even5 = new Auto("Toyota", "Modelo2", 2014, 23000);

        InventarioAuto<Auto> garage = new InventarioAuto<>();

        //Pruebas de metodos
        //Agregar

        garage.añadirAuto(even1);
        garage.añadirAuto(even2);
        garage.añadirAuto(even3);
        garage.añadirAuto(even4);
        garage.añadirAuto(even5);

        //Buscar

        System.out.println("\nBuscar autos del 2001");
        List<Auto> autosAño = garage.buscarAño(2001);

        System.out.println(autosAño);

        System.out.println("\nBuscar autos de marca Toyota");
        List<Auto> autosMarca = garage.buscarMarca("Toyota");

        System.out.println(autosMarca);

        //Calcular valor

        double valor = garage.valorTotal();

        System.out.println("El valor total del garage es: " + valor);

         */


        RegistroMascotas<Mascota> veterinario = new RegistroMascotas<>();

        veterinario.MascotaAleatoria();
        veterinario.MascotaAleatoria();
        veterinario.MascotaAleatoria();
        veterinario.MascotaAleatoria();
        veterinario.MascotaAleatoria();

        //Buscar por nombre o especie

        System.out.println("\nBuscar aves");
        List<Mascota> aves = veterinario.buscarEspecie("Ave");

        System.out.println(aves);

        System.out.println("\nBuscar a Max");
        List<Mascota> buscaNombre = veterinario.buscarNombre("Max");

        System.out.println(buscaNombre);

        //Contar mascotas

        int numero = veterinario.contarMascotas();

        System.out.println("El numero de mascotas en el veterinario es de: " + numero);


    }
}