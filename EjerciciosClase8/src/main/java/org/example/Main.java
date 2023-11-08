package org.example;

import org.example.exceptions.ReservaInvalidaException;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public class GestionDeDatos {

        private int[] vector;

        public GestionDeDatos(int tamaño) {
            vector = new int[tamaño];
        }

        public void almacenarDato(int indice, int dato) {
            if (indice >= 0 && indice < vector.length) {
                vector[indice] = dato;
                System.out.println("Dato almacenado en el índice " + indice);
            } else {
                System.out.println("Error: Intentando acceder a una posición inválida en el vector");
            }
        }

        public int accederDato(int indice) {
            if (indice >= 0 && indice < vector.length) {
                return vector[indice];
            } else {
                System.out.println("Error: Intentando acceder a una posición inválida en el vector");
                return -1; // Valor por defecto o código de error
            }
        }

        public void main(String[] args) {
            GestionDeDatos gestionDeDatos = new GestionDeDatos(5);

            gestionDeDatos.almacenarDato(0, 10);
            gestionDeDatos.almacenarDato(1, 20);

            System.out.println("Dato en el índice 0: " + gestionDeDatos.accederDato(0));
            System.out.println("Dato en el índice 1: " + gestionDeDatos.accederDato(1));
            System.out.println("Dato en el índice 2: " + gestionDeDatos.accederDato(2));
        }
    }


/*
    public static void main(String[] args) throws ReservaInvalidaException {

         ----- Ejercicio 1 -----

        String datoString;
        int datoInt;


        Vuelos vuelo = new Vuelos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema \n Ingrese su nombre para la reserva");
        datoString = scanner.next();
        if(datoString == null){
            throw new ReservaInvalidaException("Debe indicar un nombre");
        }else{
            vuelo.setNombre(datoString);
        }

        System.out.println("Ingrese su destino para la reserva");
        datoString = scanner.next();
        if(datoString == null) {
            throw new ReservaInvalidaException("Debe indicar un destino");
        }else{
            vuelo.setDestino(datoString);
        }

        System.out.println("Ingrese su fecha para la reserva");
        datoString = scanner.next();
        if(datoString == null) {
            throw new ReservaInvalidaException("Debe indicar una fecha");
        }else{
            vuelo.setFechaViaje(datoString);
        }

        System.out.println("Ingrese sus asientos para la reserva");
        datoInt = scanner.nextInt();
        if(datoInt <= 0) {
            throw new ReservaInvalidaException("Debe indicar al menos un asiento");
        }else if (datoInt > 6){
            throw new ReservaInvalidaException("No hay asientos suficientes, pruebe otro destino");
        }else {
            vuelo.setNumAsientos(datoInt);
        }

        System.out.println("Datos del vuelo\n Nombre: " + vuelo.getNombre() + "\nDestino: " + vuelo.getDestino() + "\nFecha: " + vuelo.getFechaViaje() + "\nNumero de asientos: " + vuelo.getNumAsientos());
         */

        /* ----- Ejercicio 2 -----
        String datoString;
        Double datoDouble;
        int datoInt;


        Productos producto = new Productos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema \n Ingrese el nombre del producto");
        datoString = scanner.next();
        if(datoString == null){
            throw new ReservaInvalidaException("Debe indicar un nombre");
        }else{
            producto.setNombre(datoString);
        }

        System.out.println("Ingrese el precio del producto");
        datoDouble = scanner.nextDouble();
        if(datoDouble == null) {
            throw new ReservaInvalidaException("Debe indicar un precio");
        } else if (datoDouble < 0) {
            throw new ReservaInvalidaException("Debe indicar un precio que no sea negativo");
        } else{
            producto.setPrecio(datoDouble);
        }

        System.out.println("Ingrese la cantidad del producto");
        datoInt = scanner.nextInt();
        if(datoInt <= 0) {
            throw new ReservaInvalidaException("Debe indicar al menos un producto");
        }else {
            producto.setCantidad(datoInt);
        }

        System.out.println("Datos del producto\n Nombre: " + producto.getNombre() + "\nPrecio: " + producto.getPrecio() + "\nCantidad: " + producto.getCantidad());
*/


    }

