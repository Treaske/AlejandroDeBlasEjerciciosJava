import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        /* ---- Ejercicio 1 ----

        // Crear objetos de cada clase
        Mamifero mamifero = new Mamifero(12, "Coco", 34, "Pelaje", "Carnivoro" , 4, "Viviparo", "Negro", "Montaña");
        Ave ave  = new Ave(13, "Pluma", 14, "Plumaje", "Omnivoro" , 6, "Raso", "Blanco", "Jungla");
        Reptil reptil = new Reptil(14, "Dientes", 3, "Escamas", "Carnivoro" , 6, "Gruesas", "Letal", "Rio");

        // Llamar metodo saludar
        mamifero.Saludar();
        ave.Saludar();
        reptil.Saludar();

        System.out.println("Comprobacion mamifero numero de patas: " + mamifero.getNumPatas());
        //Crear objeto de tipo animal
        Animal animal = new Animal();
        animal = mamifero;

        // al añadir nuestro objeto mamifero a animal, se perderan sus variables especificas de la clase mamifero

        //System.out.println("Comprobacion mamifero numero de patas: " + animal.getNumpatas);

        // si se cambia el modificador de acceso de public a private no se podra acceder desde el main ya que los procesos privados son solo accesibles desde la propia clase

         */


        Vestimenta ropa[] = new Vestimenta[9];

        ropa[0] = new Zapato(23, "zapato1", 34, "adidas", 34, "blanco", "Goma", "Cordones");
        ropa[1] = new Zapato(25, "zapato2", 34, "nike", 45, "negro", "Goma", "velcro");
        ropa[2] = new Zapato(27, "zapato3", 56, "rebook", 23, "gris", "Goma", "Cordones");
        ropa[3] = new Pantalon(33, "pantalon1", 67, "puma", 65, "blanco", "largo", "tela");
        ropa[4] = new Pantalon(63, "pantalon2", 432, "adidas", 3, "gris", "corto", "tela");
        ropa[5] = new Pantalon(73, "pantalon3", 57, "nike", 56, "blanco", "corto", "lana");
        ropa[6] = new Camiseta(8, "camiseta1", 9, "nike", 56, "negro", "estrecha", "largo");
        ropa[7] = new Camiseta(25, "camiseta2", 34, "rebook", 4, "blanco", "larga", "bajo");
        ropa[8] = new Sombrero(4, "sombrero1", 67, "adidas", 34, "negro", "fieltro", "pequeño");

        //recorremos el  vector
        for (int i = 0; i < ropa.length; i++) {
            ropa[i].Mostrar();
        }
    }
}