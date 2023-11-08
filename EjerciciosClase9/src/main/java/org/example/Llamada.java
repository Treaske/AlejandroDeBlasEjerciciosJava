package org.example;

public class Llamada {
    private String nombreCliente;
    private int duracionLlamada;

    public Llamada() {
    }

    public Llamada(String nombreCliente, int duracionLlamada) {
        this.nombreCliente = nombreCliente;
        this.duracionLlamada = duracionLlamada;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(int duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }
}
