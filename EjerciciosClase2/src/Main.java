import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  ----- Ejercicio 1 -----
        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique su edad");
        edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Entrada permitida");
        } else{
            System.out.println("Lo siento, no tienes permitida la entrada");
        }
         */

        /* ----- Ejercicio 2 -----
        int cont;
        double pre, tot;

        cont = 0;
        tot = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema, por favor indique el precio del producto.\n --Cuando desee detener el programa añada un precio en negativo");
        pre = scanner.nextDouble();

        while(pre > 0){
            tot += pre;
            cont++;

            System.out.println("Siguente producto");
            pre = scanner.nextDouble();

        }

        System.out.printf("El precio total de la compra es de %.2f con un total de %d articulos", tot, cont);
        System.out.println("\nFinal del programa");
         */

        /* ----- Ejercicio 3 -----
        double[] temp = new double[7];
        double med;

        med = 0;
        Scanner scanner = new Scanner(System.in);

        for (int cont = 1; cont < 8; cont++){
            System.out.println("Añada la temperatura maxima " + cont);
            temp [cont-1] = scanner.nextDouble();
        }
        for(int x=0; x < 7; x++){
            med += temp[x];
        }
        med = med/7;

        System.out.printf("La temperatura media es de %.2f", med);
         */

        String [][] asientos = new String[5][5];
        int fi, as, cont;

        cont = 1;
        Scanner scanner = new Scanner(System.in);

        // Rellenar el array de asientos vacios al comenzar el programa
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                asientos[x][y] = "O";
            }
        }

        // Mostrar Asientos
        System.out.printf("**** Asientos Disponibles ****\n      ---  %s %s %s %s %s  ---\n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  ", asientos[0][0],asientos[0][1],asientos[0][2],asientos[0][3],asientos[0][4],asientos[1][0],asientos[1][1],asientos[1][2],asientos[1][3],asientos[1][4],asientos[2][0],asientos[2][1],asientos[2][2],asientos[2][3],asientos[2][4],asientos[3][0],asientos[3][1],asientos[3][2],asientos[3][3],asientos[3][4],asientos[4][0],asientos[4][1],asientos[4][2],asientos[4][3],asientos[4][4]);

        while(cont > 0){
            // Seleccionar asiento
            System.out.println("\nSeleccionar asiento");
            System.out.println("Fila");
            fi = scanner.nextInt();
            System.out.println("Asiento");
            as = scanner.nextInt();

            // Comprobar si el asiento esta ocupado
            if (asientos[fi][as] == "X"){
                System.out.println("El asiento esta ocupado, pruebe de nuevo");
            } else if (fi >= 5 || fi <= -1) {
                System.out.println("Esa fila no existe, pruebe de nuevo");
            } else if (as >= 5 || as <= -1) {
                System.out.println("Ese asiento no existe, pruebe de nuevo");
            } else{
                asientos[fi][as] = "X";
            }
            
            System.out.printf("\n**** Asientos Disponibles ****\n      ---  %s %s %s %s %s  ---\n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  ", asientos[0][0],asientos[0][1],asientos[0][2],asientos[0][3],asientos[0][4],asientos[1][0],asientos[1][1],asientos[1][2],asientos[1][3],asientos[1][4],asientos[2][0],asientos[2][1],asientos[2][2],asientos[2][3],asientos[2][4],asientos[3][0],asientos[3][1],asientos[3][2],asientos[3][3],asientos[3][4],asientos[4][0],asientos[4][1],asientos[4][2],asientos[4][3],asientos[4][4]);

            System.out.println("\nSeguir añadiendo");
            cont = scanner.nextInt();

        }

        System.out.println("\n\nFinal del programa");
        System.out.printf("**** Asientos Disponibles ****\n      ---  %s %s %s %s %s  ---\n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  \n      ---  %s %s %s %s %s  ---  ", asientos[0][0],asientos[0][1],asientos[0][2],asientos[0][3],asientos[0][4],asientos[1][0],asientos[1][1],asientos[1][2],asientos[1][3],asientos[1][4],asientos[2][0],asientos[2][1],asientos[2][2],asientos[2][3],asientos[2][4],asientos[3][0],asientos[3][1],asientos[3][2],asientos[3][3],asientos[3][4],asientos[4][0],asientos[4][1],asientos[4][2],asientos[4][3],asientos[4][4]);


    }
}