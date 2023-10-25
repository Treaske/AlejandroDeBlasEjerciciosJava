import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un numero");
        num1 = scanner.nextInt();

        System.out.println("Escriba un segundo numero");
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("El primer numero es el mayor");
        } else if (num2 > num1) {
            System.out.println("El segundo numero es el mayor");
        }else{
            System.out.println("Son iguales");
        }
        */

        /*
        double peso, altura, imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es su peso?");
        peso = scanner.nextDouble();

        System.out.println("Cual es su altura?");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Usted tiene peso bajo");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Usted esta en su peso");
        }else if (imc > 25 && imc < 29.9) {
            System.out.println("Usted tiene sobrepeso");
        }else{
            System.out.println("Usted tiene obesidad");
        }

        System.out.println("Su IMC es de: " + imc);
         */

        /*
        int cod;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el codigo del comprobante");
        cod = scanner.nextInt();

        switch (cod){
            case 1:
                System.out.println("Facturas A");;
                break;
            case 2:
                System.out.println("C");;
                break;
            case 3:
                System.out.println("Notas de Credito A");;
                break;
            case 4:
                System.out.println("Recibos A");;
                break;
            case 5:
                System.out.println("Notas de venta al Contado A");;
                break;
            case 6:
                System.out.println("Facturas B");;
                break;
            case 7:
                System.out.println("Notas de Debito B");;
                break;
            case 8:
                System.out.println("Notas de Credito B");;
                break;
            case 9:
                System.out.println("Recibos B");;
                break;
            case 10:
                System.out.println("Notas de Venta al Contado B");;
                break;
            default:
                System.out.println("Indefinido");
                break;

         */

        int sum, cont;

        int [] notas = new int[9];

        sum = 0;
        cont = 1;

        Scanner scanner = new Scanner(System.in);

        for(int x=0; x < 8; x++){
            System.out.println("Escriba su " + cont + " nota");
            not = scanner.nextInt();

            sum += not;
            cont++;
        }
        not = sum / (cont-1);
        System.out.println("La media de tus notas es: " + not);
        System.out.println("Final del Programa");
    }
}