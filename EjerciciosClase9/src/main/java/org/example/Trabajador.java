package org.example;

public class Trabajador  implements Runnable {

    private String nombre;

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            double cantidad = Math.random() * 1000;

            if(cantidad > 333){
                System.out.println("El trabajador: " + nombre + " esta ensamblando");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Se termino de ensamblar el producto");

            } else if (cantidad < 666){
                System.out.println("El empleado " + nombre + " está revisando un producto ensamblado.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Control de calidad ha aprobado el producto.");
            } else {
                System.out.println("El empleado " + nombre + " está empaquetando un producto.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Producto empaquetado.");
            }
        }

    }
}
