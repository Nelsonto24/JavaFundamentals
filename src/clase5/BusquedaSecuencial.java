package clase5;

import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        boolean estado = false;
        int pos=0;
        Scanner sc = new Scanner(System.in);
        //int array[]={12,32,98,44,26};
        System.out.print("Ingresa cantidad de números del array: ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingresa el valor de la posición " + (i) + " del array: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Ingrese número a buscar");
        int nro = sc.nextInt();
        for (int j = 0; j < array.length; j++) {
        //while(j<array.length && estado==false){
             if (array[j] == nro) {
                estado = true;
                //j++;
                pos=j;
             }
            }
        if (estado == false)
            System.out.println("El número no se encuentra en el array ");
        else
            System.out.println("Número encontrado en la posición " + pos + " del array");
    }
}