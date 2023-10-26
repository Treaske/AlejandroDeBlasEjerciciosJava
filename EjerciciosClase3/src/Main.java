public class Main {
    public static void main(String[] args) {

        /*
        Electrodomestico electro1 = new Electrodomestico(23, "LG", "435ty", "elevado", "blanco");
        Electrodomestico electro2 = new Electrodomestico(25, "Sommer", "88uy4", "bajo", "negro");
        Electrodomestico electro3 = new Electrodomestico(27, "LG", "66YTE", "disminuido", "blanco");

        Electrodomestico electro4 = new Electrodomestico();

        System.out.println("Marca: " + electro1.getMarca() + " Modelo: " + electro1.getModelo() + " Consumo: " + electro1.getConsumo());
        System.out.println("Marca: " + electro2.getMarca() + " Modelo: " + electro2.getModelo() + " Consumo: " + electro2.getConsumo());
        System.out.println("Marca: " + electro3.getMarca() + " Modelo: " + electro3.getModelo() + " Consumo: " + electro3.getConsumo());

        //Se obtiene valor null si no se le asigna ningun valor
        System.out.println("Marca: " + electro4.getMarca());

         */

        Persona [] personas = new Persona[5];

        Persona persona1 = new Persona(354, "Juan", 34, "Calle 1", "2342355");
        Persona persona2 = new Persona(456, "Marta", 65, "Calle 2", "782435");
        Persona persona3 = new Persona(657, "Mario", 5, "Calle 3", "85643456");
        Persona persona4 = new Persona(54, "Alberto", 65, "Calle 4", "45678493");
        Persona persona5 = new Persona(778, "Maria", 8, "Calle 5", "36956975");

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;
        personas[3] = persona4;
        personas[4] = persona5;

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + " Edad: " + personas[i].getEdad());
        }


        // Cambiar Nombres
        System.out.println("Cambiar el nombre de la persona1: " + personas[0].getNombre() + " por Alex");
        personas[0].setNombre("Alex");
        System.out.println("Cambiar el nombre de la persona2: " + personas[1].getNombre() + " por Laura");
        personas[1].setNombre("Laura");
        System.out.println("Nuevos nombres-- Persona1: " + personas[0].getNombre() + " Persona2: " + personas[1].getNombre());


        //Mostrar solo las mayores de 30
        System.out.println("Personas Mayores de 30");
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 30) {
                System.out.println("Nombre: " + personas[i].getNombre() + " Edad: " + personas[i].getEdad());
            }
        }
    }
}