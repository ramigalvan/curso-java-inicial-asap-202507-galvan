package encuentro4;


/**
 *Ejercicio02
 * Programa que genera un array de 8 enteros aleatorios entre 1 y 10,
 * lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo muestra.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        final int TAM_ARRAY = 8;
        int[] numerosAleatorios = new int[TAM_ARRAY];
        //genera array
        generarArrayAleatorios(numerosAleatorios);

        System.out.println("Array generado con numeros aleatorios: ");
        mostrarArray(numerosAleatorios);
        //algoritmo ordenada el array
        ordenarArrayBurbuja(numerosAleatorios);
        System.out.println("Array ordenado de menor a mayor: ");
        mostrarArray(numerosAleatorios);
    }

    private static void generarArrayAleatorios(int[] array){
        for (int i = 0; i < array.length; i++){
            int numeroRandom = (int) (Math.random() * 10 + 1);
            array[i] = numeroRandom;
        }
    }

    private static void mostrarArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void ordenarArrayBurbuja(int[] array){
        int temp;
        for(int i = 0; i < array.length - 1; i++){

            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
