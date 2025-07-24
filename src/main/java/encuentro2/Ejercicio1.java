package encuentro2;

import java.util.Scanner;

/**
 *Escribir un programa que muestre los N primeros numeros de la serie de Fibonacci. El valor de N
 * se lee por teclado.
 * La serie de fibonacci la forman una serie de numeros tales que: El primer termino de la serie es el
 * numero 1. El segundo termino de la serie es el numero 1. Los siguientes terminos de la serie de
 * fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int n = scanner.nextInt();
        fibonacci(n);
    }

    private static void fibonacci(int n) {
        if(n <= 0){
            System.out.println("Ingrese un numero mayor a 0");
            return;
        }

        int primerNumero = 1; //empezar con 0 o 1?
        int segundoNumero = 1;

        System.out.print("Primeros numeros de la serie Fibonacci: ");
        System.out.print(primerNumero + " ");

        if(n > 1){
            System.out.print(segundoNumero + " ");
        }

        for (int i = 3; i <= n; i++){
            int fibonacci = primerNumero + segundoNumero;
            System.out.print(fibonacci + " ");

            primerNumero = segundoNumero;
            segundoNumero = fibonacci;
        }
    }
}
