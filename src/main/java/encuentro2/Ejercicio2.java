package encuentro2;

import java.util.Scanner;

/**
 * Escribir un programa que compruebe si dos numeros son amigos. Dos numeros enteros positivos
 * A y B son numeros amigos si la suma de los divisores propios de A es igual a B y la suma de los
 * divisores propios de B es igual a A.
 * Los divisores propios de un número incluyen la unidad pero no el propio numero.
 * Un ejemplo de numeros amigos son los numeros 220 y 284.
 * Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
 * La suma de los divisores propios de 220 da como resultado 284
 * Los divisores propios de 284 son 1, 2, 4, 71 y 142.
 * La suma de los divisores propios de 284 da como resultado 220.
 * Por lo tanto 220 y 284 son amigos
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero:");
        int primerNumero = scanner.nextInt();

        System.out.println("ingrese el segundo numero:");
        int segundoNumero = scanner.nextInt();

        if(primerNumero <= 0 || segundoNumero <= 0 ){
            System.out.println("los numeros deben ser enteros positivos.");
            return;
        }

        int suma1 = sumaDivisoresPropios(primerNumero);
        int suma2 = sumaDivisoresPropios(segundoNumero);

        if(suma1 == segundoNumero && suma2 == primerNumero){
            System.out.println("Los numeros ingresados son amigos");
        }else{
            System.out.println("Los numeros ingresados no son amigos");
        }
    }

    public static int sumaDivisoresPropios(int numero){
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if(numero % i == 0){
                suma += i;
            }
        }
        return suma;
    }
}
