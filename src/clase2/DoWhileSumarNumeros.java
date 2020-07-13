package clase2;

import javax.swing.*;
import java.util.Scanner;
public class DoWhileSumarNumeros {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //boolean continuar;
        System.out.println("Introduce tu nombre");
        String nombre=sc.nextLine();
        String apellido= JOptionPane.showInputDialog("Introduce tu apellido \n");
        System.out.println("Bienvenido "+nombre+" "+apellido);
        char rpta;
        do{
        System.out.print("Ingresa primer número a sumar:");
        double nro1 = sc.nextDouble();
        System.out.print("Ingresa segundo número a sumar:");
        double nro2 = sc.nextDouble();
        double suma=nro1+nro2;
        System.out.print("La suma es "+suma+"\n");
        System.out.print("Desea continuar [S] o [N]?");
        //continuar = sc.nextBoolean();
        rpta= sc.next().charAt(0);
        }while(rpta=='s'|| rpta=='S');
        sc.close();
        System.out.print("Fin del programa");
        }}
