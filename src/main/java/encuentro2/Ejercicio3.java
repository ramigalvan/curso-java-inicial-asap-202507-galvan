package encuentro2;

import java.util.Scanner;

/**
 *Escribir un programa que lea por teclado un numero entero positivo y calcule la suma de sus
 * cifras. Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La suma de sus
 * cifras es: 10".
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int numero = scanner.nextInt();

        if(numero <= 0){
            System.out.println("Debe de ingresar un numero entero positivo.");
            return;
        }

        System.out.println("La suma de sus cifras es: " + sumarCifras(numero));
    }

    public static int sumarCifras(int numero){
        int suma = 0;
        while(numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero = numero / 10;
        }
        return suma;
    }
}
