package encuentro1;

import java.util.Scanner;

/**
 * Escribir un programa lea por teclado una calificacion numerica entre 0 y 10 y muestre por pantalla
 * su correspondiente calificacion alfabetica.
 * La equivalencia entre la calificacion numerica y la alfabetica se muestra en esta tabla:
 * ● 0 <= nota < 5 Insuficiente
 * ● 5 <= nota < 6 Suficiente
 * ● 6 <= nota < 7 Bien
 * ● 7 <= nota < 9 Notable
 * ● 9 <= nota <= 10 Sobresaliente
 * La calificacion numerica que se introduce por teclado debe estar comprendida entre 0 y 10 para
 * poder obtener su equivalente calificacion alfabetica. Si la calificacion introducida no es valida se
 * muestra un mensaje indicandolo y el programa finaliza.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota = -1;
        System.out.println("Ingrese una calificacion numerica entre (0-10)");
        nota = scanner.nextInt();

        if (nota == 10 || nota == 9) {
            System.out.println("Calificacion: Sobresaliente");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Calificacion: Notable");
        } else if (nota == 6) {
            System.out.println("Calificacion: Bien");
        } else if (nota == 5) {
            System.out.println("Calificacion: Suficiente");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Calificacion: Insuficiente");
        } else {
            System.out.println("Calificacion introducida invalida.\n Programa finalizado.");
        }

    }
}
