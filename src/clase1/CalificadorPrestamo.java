package clase1;

import java.util.Scanner;
/*
 Para calificar para un préstamo, una persona debe ganar al menos S/3000
 y debe estar laborando en su trabajo actual durante al menos 2 años.
 */
public class CalificadorPrestamo {
    public static void main(String args[]) {
        //Obtener el salario
        System.out.print("Ingresa sueldo: ");
        Scanner sc = new Scanner(System.in);
        int sueldo = sc.nextInt();
        System.out.print("Ingresa años de trabajo ");
        int tiempo = sc.nextInt();
        if (sueldo >= 3000 && tiempo >= 2)
            System.out.print("Califica al préstamo");
        else {
            if (sueldo < 3000 && tiempo < 2)
                System.out.print("No califica por el monto y tiempo");
            else {
                if (sueldo < 3000)
                    System.out.print("No califica por el monto");
                else {
                    if (tiempo < 2)
                        System.out.print("No califica por el tiempo");
                }

            }
         }
    }
}

