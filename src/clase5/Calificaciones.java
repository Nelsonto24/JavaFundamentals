package clase5;

import java.util.Scanner;

//crear un programa que permita al usuario ingresar cualquier número de calificaciones y les proporcione su puntaje así como los puntajes más altos y bajos
public class Calificaciones {
    private static int calificaciones[];
    //private static int n;
    private static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Cuántas calificaciones desea ingresar?: ");
        //n=sc.nextInt();
        calificaciones=new int[sc.nextInt()];
        getCalificaciones();
        System.out.println("Promedio: "+String.format("%.2f", calcularPromedio()));
        System.out.println("Mayor calificación "+ getMayorCalificacion());
        System.out.println("Menor calificación "+ getMenorCalificacion());
    }

    public static void getCalificaciones(){
        for(int i=0; i<calificaciones.length;i++) {
            System.out.print("ingresar calificación #" + (i + 1) + ": ");
            calificaciones[i] = sc.nextInt();
        }
    }

    public static double calcularPromedio(){

        return CalcularSuma()/calificaciones.length;
    }

    public static int CalcularSuma(){
        int suma=0;
        for (int calificacion:calificaciones){
            suma=suma+calificacion;
        }
        return suma;
    }

    /*public static int CalcularSuma(){
        int suma=0;
        for (int i = 0; i<calificaciones.length; i++){
            suma+=calificaciones[i];
        }
        return suma;
    }*/

    public static int getMayorCalificacion(){
        int mayorCalificacion=calificaciones[0];
        for(int calificacion:calificaciones){
        /*for(int i=0;i<calificaciones.length;i++){
             if(calificaciones[i]>mayorCalificacion) {
                mayorCalificacion=calificaciones[i];*/
            if(calificacion>mayorCalificacion) {
                mayorCalificacion=calificacion;
            }
        }
        return mayorCalificacion;
    }

    public static int getMenorCalificacion(){
        int menorCalificacion=calificaciones[0];
        for(int calificacion:calificaciones){
            if(calificacion<menorCalificacion)
            menorCalificacion=calificacion;
        }
        return menorCalificacion;
    }
}

