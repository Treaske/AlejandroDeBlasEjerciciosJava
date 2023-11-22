package org.example;

public class Agente extends Thread  {
    private String nombre;
    private Llamada llamada;

    public Agente(String nombre, Llamada llamada){
        this.nombre = nombre;
        this.llamada = llamada;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            double cantidad = Math.random() * 1000;

            if(cantidad < 500){
                Llamada llamada1 = new Llamada();
                llamada1.setDuracionLlamada(llamada.getDuracionLlamada());
                llamada1.setNombreCliente(llamada.getNombreCliente());
                System.out.println(nombre + " contesta una llamada con el cliente: " + llamada.getNombreCliente() + " de duracion: " + llamada.getDuracionLlamada());
            } else {
                System.out.println(nombre + " resuelto una consulta");
            }
        }
    }
}
