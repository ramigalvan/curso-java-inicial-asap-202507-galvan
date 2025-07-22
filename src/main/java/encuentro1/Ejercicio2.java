package encuentro1;

import java.util.Scanner;

/**
 * Un programa que pide por teclado la fecha de nacimiento de una persona
 * (dia, mes, anio) y calcula su numero de la suerte.
 */
public class Ejercicio2 {



    public static void main(String[] args) {
        //inicializar variables
        int dia, mes, anio = 0;

        Scanner scanner = new Scanner(System.in);

        //leer desde el teclado las fechas de nacimiento
        System.out.println("Ingrese el dia de su nacimiento: ");
        dia = scanner.nextInt();

        System.out.println("Ingrese el mes de su nacimiento: ");
        mes = scanner.nextInt();

        System.out.println("Ingrese el anio de su nacimiento: ");
        anio = scanner.nextInt();

        //calcular y mostrar el numero de la suerte
        int numeroSuerte = calcularNumeroSuerte(dia, mes, anio);
        System.out.println("Su numero de la suerte es: " + numeroSuerte);

    }

    /**
     * El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y a continuacion sumando
     * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es 12/07/1980
     * Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
     * Numero de la suerte: 28
     * @param dia
     * @param mes
     * @param anio
     * @return numero de la suerte
     */
    public static int calcularNumeroSuerte(int dia, int mes, int anio) {
        int total = 0 ;
        int numero  = (dia + mes + anio);
        while(numero > 0) {
            int digito = numero % 10;
            total += digito;
            numero = numero / 10;
        }
        return total;
    }
}
