package clase2;

import java.util.Scanner;

public class CambioPorUnJuegoSol {
    public static void main(String args[]) {
        System.out.print("Ingresa cantidad de monedas de 1 céntimo: ");
        Scanner sc = new Scanner(System.in);
        int moneda1= sc.nextInt();
        System.out.print("Ingresa cantidad de monedas de 5 céntimos: ");
        int moneda2= sc.nextInt();
        System.out.print("Ingresa cantidad de monedas de 10 céntimos: ");
        int moneda3= sc.nextInt();
        System.out.print("Ingresa cantidad de monedas de 25 céntimos: ");
        int moneda4= sc.nextInt();
        double multi1=moneda1*0.01;
        double multi2=moneda2*0.05;
        double multi3=moneda3*0.10;
        double multi4=moneda4*0.25;
        double suma=multi1+multi2+multi3+multi4;
        if(suma==1)
            System.out.print("Ganó");
        else{
            if(suma>=1)
                System.out.print("Excedió "+(suma-1));
            else
                System.out.print("Falta "+ (1-suma));
            }
    }
}
