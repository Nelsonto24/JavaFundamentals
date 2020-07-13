package clase5;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        boolean estado = false;
        Scanner sc = new Scanner(System.in);
        //int array[]={12,32,98,44,26};
        System.out.print("Ingresa cantidad de números del array: ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.print("Ingresa el valor de la posición " + (i) + " del array: ");
                array[i] = sc.nextInt();
            } while (array[i] < 0);
        }
        System.out.println("Array ordenado:");
        Arrays.sort(array);
        for (int j = 0; j < array.length; j++) {
            System.out.println("Posición [" + j + "] del array es " + array[j]);
        }
        System.out.println("Ingrese número a buscar");
        int nro = sc.nextInt();
        //int index=Arrays.binarySearch(array, nro);
        //System.out.println("El número se encuentra en la posición "+index);
        int ultimo = array.length, primero = 0, centro;
        do {
            centro = (primero + ultimo) / 2;
            if (array[centro] == nro) {
                estado=true;
                System.out.println("El número buscado se encuentra en la posición " + centro);
                break;
            } else {
                if (nro < array[centro])
                    ultimo = centro - 1;
                else
                    primero = centro + 1;
            }
        } while (primero <= ultimo);
        if(estado==false)
            System.out.println("Número no se encuentra en el array");

    }
}
