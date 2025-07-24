package encuentro1;

import java.util.Scanner;

/**
 *Escribir un programa que compruebe si un anio es bisiesto. Un anio es bisiesto si es divisible por 4
 * y no lo es por 100 o si es divisible por 400.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un anio para verificar si es bisiesto");
        int anio = scanner.nextInt();
        boolean esBisiesto =  ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));

        System.out.println( "El año " + anio + (esBisiesto ? " es" : " no es") + " bisiesto.");

    }
}
