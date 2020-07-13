package clase3;

import java.util.*;

public class Contadores {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numeros = new int[5];
            int i, pos = 0, neg = 0, cero = 0, sumaPos=0, sumaNeg=0; //contadores

            //Leemos los valores por teclado y los guardamos en el array
            for (i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese valor de la posición [" + i + "] del vector: ");
                numeros[i] = sc.nextInt();
            }

            //se recorre el array para contar positivos, negativos y ceros
            for (i = 0; i < numeros.length; i++) {
                 if (numeros[i] > 0) {
                    sumaPos+=numeros[i]; //sumaPos=numeros[i]+sumaPos
                    pos++;
                 } else
                     if (numeros[i] < 0) {
                     sumaNeg+=numeros[i];
                     neg++;
                 } else {
                        //if(numeros[i]==0)
                        cero++;
                    }
                }
                System.out.println("Positivos: " + pos);
                System.out.println("Negativos: " + neg);
                System.out.println("Ceros: " + cero);
                if(pos!=0)
                System.out.println("Media de los valores positivos: " + sumaPos/pos);
                else
                    System.out.println("No ha introducido números positivos");
                if(neg!=0)
                System.out.println("Media de los valores negativos: " + sumaNeg/neg);
                else
                    System.out.println("No ha introducido números negativos");
                if(cero==0)
                    System.out.println("No ha introducido valor 0");
            }
        }

