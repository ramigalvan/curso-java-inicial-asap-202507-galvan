package encuentro3;

import com.github.sanchezih.util.io.Consola;

/**
 * Escribir un programa que pida 10 numeros por teclado, los almacene en un array y que luego
 * muestre el maximo valor, el minimo y las posiciones que ocupan en el array.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int TAM_ARRAY = 5;
        int[] numeros = new int[TAM_ARRAY];

        for (int i = 0; i < TAM_ARRAY; i++) {
            System.out.println("Ingrese un numero:");
            numeros[i] = Consola.leerEntero();
        }

        int maxValor = maximoValorArray(numeros);
        int minValor = minimoValorArray(numeros);
        System.out.println("El maximo valor dentro del array es: " + maxValor);
        System.out.println("El minimo valor dentro del array es: " + minValor);
        System.out.println("Posicion del valor maximo dentro del array: " + obtenerPosicion(numeros, maxValor));
        System.out.println("Posicion del valor minimo dentro del array: " + obtenerPosicion(numeros, minValor));
    }

    /**
     * Busca la posición de un valor dentro de un array.
     * Si el valor aparece más de una vez, devuelve la última posición encontrada.
     *
     * @param array Array de enteros donde se realiza la búsqueda
     * @param valor Valor a encontrar
     * @return indice del valor encontrado o -1 si no se encuentra
     */
    public static int obtenerPosicion(int[] array, int valor) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                pos = i;
            }
        }
        return pos;
    }

    /**
     * Devuelve el valor máximo presente en el array.
     *
     * @param array Array de enteros
     * @return Valor máximo encontrado
     */
    private static int maximoValorArray(int[] array) {
        //verificar si el array esta vacio?
        int max = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        return max;
    }


    /**
     * Devuelve el valor maximo presente en el array.
     *
     * @param array Array de enteros
     * @return Valor maximo encontrado
     */
    private static int minimoValorArray(int[] array) {
        //verificar si el array esta vacio?
        int min = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        return min;
    }

}
