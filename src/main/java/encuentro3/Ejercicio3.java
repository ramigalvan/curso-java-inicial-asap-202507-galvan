package encuentro3;

import com.github.sanchezih.util.io.Consola;

/**
 * Escribir un programa que pida 5 numeros enteros, los almacene en un array, e indique por
 * pantalla si dicho array es capicua.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int TAM_ARRAY = 5;
        int[] numeros = new int[TAM_ARRAY];

        cargarArray(numeros);
        boolean esCapicua = esArrayCapicua(numeros);

        System.out.println("El array " + (esCapicua ? "es " : "no es ") + "capicua.");
    }

    /**
     * Solicita al usuario que ingrese numeros enteros positivos para llenar el array.
     * Valida que cada numero ingresado sea mayor o igual a cero.
     *
     * @param array Array que será llenado con los números ingresados por el usuario.
     */
    public static void cargarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.println("Ingrese un numero entero positivo:");
                array[i] = Consola.leerEntero();
                if (array[i] < 0) {
                    System.out.println("El numero debe ser mayor o igual a cero.");
                }
            } while (array[i] < 0);
        }
    }
    /**
     * Verifica si un array es capicua.
     * Compara los elementos desde los extremos hacia el centro.
     *
     * @param array Array de enteros a verificar.
     * @return true si el array es capicua, false en caso contrario.
     */
    public static boolean esArrayCapicua(int[] array) {
        boolean resultado = true;
        int mitadArray = array.length / 2;

        for (int i = 0; i < mitadArray; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                resultado = false;
                break;
            }
        }
        return resultado;
    }
}
