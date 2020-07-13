package clase1;

import java.util.Scanner;

public class ResultadoGradoMensaje {
    public static void main(String args[]) {
        //Obtener el grado
        System.out.print("Ingresa el grado del alumno: ");
        Scanner sc = new Scanner(System.in);
        char grado = sc.next().charAt(0);
        String message="";
        switch (Character.toUpperCase(grado)){
            case 'F':
                message="Su puntaje es menor a 60";
                break;
            case 'D':
                message="Su puntaje es menor a 70";
                break;
            case 'C':
                message="Su puntaje es menor a 80";
                break;
            case 'B':
                message="Su puntaje es menor a 90";
                break;
            default: message="Su puntaje es mayor a 90";

        } System.out.println(message);
}}

