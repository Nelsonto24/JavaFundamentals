package clase1;

import java.util.Scanner;

public class NumeroMayor {

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese nro1");
        int nro1=sc.nextInt();
        System.out.println("Ingrese nro2");
        int nro2=sc.nextInt();
        System.out.println("Ingrese nro3");
        int nro3=sc.nextInt();
        if(nro1>nro2)
            if(nro1>nro3){
            System.out.println("Mayor es nro 1");}
            else{
                System.out.println("Mayor es el nro3");
            }
            if(nro2>nro3){
                System.out.println("Mayor es el nro2");
            }
            else{
                System.out.println("Mayor es el nro3");
            }
    }
}
