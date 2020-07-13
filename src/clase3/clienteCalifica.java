package clase3;

import java.util.Scanner;
/*
Escriba un programa de "verificación de crédito instantánea" que apruebe cualquier persona
que gane más de S/ 25,000 y tenga un score de crédito de 700 o mejor. Rechaza a todos los demás.
 */
public class clienteCalifica {
    static int salarioMin=25000;
    static int scoreMin=700;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double salario=getSalario();
        int score=getScore();
        boolean califica=calificacion(salario, score);
        notificaResultado(califica);
    }
    public static double getSalario (){
        System.out.println("Ingrese salario");
        double salario=sc.nextDouble();
        return salario;
    }
    public static int getScore(){
        System.out.println("Ingrese score crediticio");
        int score=sc.nextInt();
        return score;
    }
    public static boolean calificacion(double salario, int score) {
    if(salario>=salarioMin && score>=scoreMin)
        return true;
    else
        return false;
    }
    public static void notificaResultado(boolean califica) {
        if(califica)
        System.out.println("Felicidades, usted califica");
        else
           System.out.println("Usted no califica");
    }

}

