import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  ------- Ejercicio 1 -------
        String nombre;
        nombre = "Eduardo";

        System.out.println("Hola " + nombre + ", bienvenido al sistema");
         */

        /*  ------- Ejercicio 2 -------
        int edad;
        double altura;
        boolean suscripcion;
        String nombre;

        nombre = "Alex";
        edad = 22;
        suscripcion = true;
        altura = 1.80;

        System.out.println("Datos del Usuario " + nombre + "\nAltura: " + altura + "\nEdad: " + edad + "\nSuscrito: " + suscripcion);
         */

        /*  ------- Ejercicio 3 -------
        double alt, bas, area;

        bas = 2.24;
        alt = 4.5;

        area = (bas * alt) / 2;

        System.out.printf("El area del triangulo es de %.2f", area);
         */

        double num1, num2, sum, res, mul, div;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Cual es el primer numero?");
        num1 = scanner.nextDouble();

        System.out.println("Cual es el segundo numero?");
        num2 = scanner.nextDouble();

        sum = num1 + num2;
        res = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        System.out.printf("---- Resultados ----\n Suma: %.2f\n Resta: %.2f\n Multiplicacion: %.2f\n Division: %.2f", sum, res, mul, div);
    }
}