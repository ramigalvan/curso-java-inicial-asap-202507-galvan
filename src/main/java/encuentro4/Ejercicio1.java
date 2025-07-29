package encuentro4;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio01
 * Programa que pide el ingreso de un numero e indica si es un numero primo o no.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;

        System.out.println("Ingrese un numero:");
        numero = Consola.leerEntero();

        //verificar que sea un numero primo
        boolean primo = esPrimo(numero);
        System.out.println("El numero " + numero + (primo ? " es primo" : " no es primo"));
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        int cantidadDivisores = 0;
        int i = 1;

        while (i <= numero && cantidadDivisores <= 2) {
            if (numero % i == 0) {
                cantidadDivisores++;
            }
            i++;
        }
        return cantidadDivisores == 2;
    }

}
