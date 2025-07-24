package encuentro3;

import com.github.sanchezih.util.io.Consola;


/**
 * Escribir un programa que lea la altura de N personas y calcule:
 * 1. La altura media.
 * 2. Cuantas personas tienen una altura superior a la media.
 * 3. Cuantas tienen una altura inferior a la media.
 * El valor de N se pide por teclado y debe ser entero positivo.a
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int n = 0;
        do {
            System.out.println("Ingrese el numero de personas que seran atendidas");
            n = Consola.leerEntero();
        } while (n <= 0);
        double[] alturas = new double[n];

        //carga las alturas de las personas en un array
        double sumaAlturas = 0;
        for (int i = 0; i < alturas.length; i++) {
            do{
                System.out.println("Ingrese la altura de la persona " + i + ":");
                alturas[i] = Consola.leerDouble();
                if(alturas[i] <= 0){
                    System.out.println("La altura debe ser un numero positivo.");
                }
            }while(alturas[i] <= 0);

            sumaAlturas += alturas[i];
        }

        double media = sumaAlturas / alturas.length;
        System.out.println("La altura media es: " + media);
        System.out.println("Personas que tienen una altura superior a la media: " + cantidadSuperiorMedia(alturas, media));
        System.out.println("Personas que tienen una altura inferior a la media: " + cantidadInferiorMedia(alturas, media));
    }

    /**
     * calcula cuantas personas tienen una altura superior a la media
     * @param alturasParam Array con las alturas ingresadas
     * @param mediaParam Valor medio calculado a partir de las alturas
     * @return Cantidad de personas cuya altura es mayor a la media
     */
    private static int cantidadSuperiorMedia(double[] alturasParam, double mediaParam){
        int cantidad = 0;

        for (double altura: alturasParam) {
            cantidad +=  (altura > mediaParam) ? 1 : 0;
        }
        return cantidad;
    }

    /**
     * calcula cuantas personas tienen una altura inferior a la media
     * @param alturasParam Array con las alturas ingresadas
     * @param mediaParam Valor medio calculado a partir de las alturas
     * @return cantidad de personas cuya altura es menor a la media
     */
    private static int cantidadInferiorMedia(double[] alturasParam, double mediaParam){
        int cantidad = 0;

        for (double altura: alturasParam) {
            cantidad +=  (altura < mediaParam) ? 1 : 0;
        }
        return cantidad;
    }
}
