package clase5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MetodosBusquedas<estado> {
        private static final int LONGITUD = 6;  //final para valores que persisten
        private static final int MAXIMO_NRO_TK = 69;

        public static void main(String[] args) {
            int[] ticket = generarNumeros();
            //Arrays.sort(ticket);
            imprimirTK(ticket);
        }

        public static int[] generarNumeros() {
            int[] tk = new int[LONGITUD];
            Random random = new Random();
            int nroRandom;
            for (int i = 0; i < LONGITUD; i++) {
                do {
                   nroRandom = random.nextInt(MAXIMO_NRO_TK) + 1;
                } while (busquedaBinaria(tk, nroRandom));
                tk[i] = nroRandom;
            }
            return tk;
        }

    /**
     *
     * @param array
     * @param nroAbuscar
     * @return
*/
        public static boolean busquedaSecuencial(int[] array, int nroAbuscar) {
            for (int valor : array) {
                if (valor == nroAbuscar) {
                    return true;
                }
            }
            return false;
        }

       public static boolean busquedaBinaria(int[] array, int nroAbuscar) {
            //El arreglo debe estar ordenado
           Arrays.sort(array);
           int index=Arrays.binarySearch(array, nroAbuscar); //devuelve un entero con la posición del elemento que encuentra, si es mayor a 0 lo encontró sino muestra posición -1
           if(index>=0)
               return true;
           else
               return false;
        }

        public static void imprimirTK(int ticket[]) {
            for (int i = 0; i < ticket.length; i++)
                System.out.print(ticket[i] + " | ");
        }
}
