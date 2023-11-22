package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

/*
        Llamada llamada1 = new Llamada("Cliente1", 34);
        Llamada llamada2 = new Llamada("Cliente2", 24);


        Thread agente1 = new Thread(new Agente("Agente 1", llamada1));
        Thread agente2 = new Thread(new Agente("Agente 2", llamada2));

        agente1.start();
        agente2.start();

 */



        Thread fabrica1 = new Thread(new Trabajador("Trabajador 1"));
        Thread fabrica2 = new Thread(new Trabajador("Trabajador 2"));
        Thread fabrica3 = new Thread(new Trabajador("Trabajador 3"));

        fabrica1.start();
        fabrica2.start();
        fabrica3.start();

        fabrica1.join();
        fabrica2.join();
        fabrica3.join();

        System.out.println("Fin del programa");




    }
}