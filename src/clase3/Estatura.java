package clase3;

import java.util.Scanner;

public class Estatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N;
        int contMas = 0, contMenos = 0;
        double suma = 0;
        //Leer el número de personas
        do{
            System.out.print("Ingrese número de personas: ");
            N = sc.nextInt();
        }while(N<=0);
        //Se crea el array de tamaño N
        double[] alto = new double[N];
        //Leer alturas
        System.out.println("Lectura de la altura de las personas: ");
        for (i = 0; i < N; i++) { //recorre vector
            System.out.print("Altura de la persona " + (i+1) + " = ");
            alto[i] = sc.nextDouble();
            suma+= alto[i]; //se suma la estatura leída para calcular la media
        }
        //Calcular la media
        double media = suma / N;
        //recorremos el array para ver cuántos hay más altos que la media y cuantos más bajos
        for (i = 0; i < alto.length; i++) {
            if (alto[i] > media){ //si la estatura es mayor que la media
                contMas++;
            } else {
                if (alto[i] < media) //si es menor
                contMenos++;
            }
        }
        //Mostrar resultados
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura superior a la media: " + contMas);
        System.out.println("Personas con estatura inferior a la media: " + contMenos);
    }
}
