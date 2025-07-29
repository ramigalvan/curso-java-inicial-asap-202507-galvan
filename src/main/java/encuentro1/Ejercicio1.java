package encuentro1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que lee un entero desde teclado y muestra por pantalla
 * si es multiplo de 2 o 3.
 *
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while(!entradaValida){
            System.out.println("Ingrese un numero");
            try{
                numero = scanner.nextInt();
                entradaValida = true;
            }catch(InputMismatchException ex){
                System.out.println("Entrada invalida. Por favor, ingrese un numero.");
                 scanner.nextLine();
            }
        }

        //evaluar si el numero es multiplo
        boolean esMultiploTres = (numero % 3 == 0);
        boolean esMultiploDos = (numero % 2 == 0);

        //mostrar resultados si el numero es o no es multiplo
        if(esMultiploTres && esMultiploDos){
            System.out.println("El numero ingresado es multiplo de 2 y 3.");
        }else if(esMultiploTres){
            System.out.println("El numero ingresado es multiplo de 3.");
        }else if(esMultiploDos){
            System.out.println("El numero ingresado es multiplo de 2 .");
        }else {
            System.out.println("El numero ingresado no es multiplo de 2 ni 3.");
        }

    }

}
