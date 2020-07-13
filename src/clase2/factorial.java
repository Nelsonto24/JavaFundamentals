package clase2;

import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        //int i=1, factorial=1;
        int i, fact=1;
        System.out.print("Ingresa nro para aplicar factorial:");
        Scanner sc = new Scanner(System.in);
        int nro = sc.nextInt();
        /*while(i<=nro){
            factorial=factorial*i;
            i++;
        }
        System.out.print("Factorial es: "+factorial);
        do{
            factorial=factorial*i;
            i++;
        } while (i<=nro);
        System.out.print("Factorial es: "+factorial); */
        for(i=1;i<=nro;i++){
            fact=fact*i; //fact*=i;
        }
        /*
        1er  vuelta i=1 factorial=1*1=1
        2da  vuelta i=2 factorial=1*2=2
        3era vuelta i=3 factorial=2*3=6
        4ta  vuelta i=4 factorial=6*4=24
        5ta  vuelta i=5 factorial=24*5=120*/

        System.out.println("Factorial de "+nro+" es: "+fact);
    }
}