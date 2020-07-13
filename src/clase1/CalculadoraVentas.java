package clase1;

import java.util.Scanner;
/*
 Se espera que todos los vendedores realicen al menos 10 ventas por semana.
 Para aquellos que lo hacen, reciben un mensaje de felicitación.
 Para aquellos que no lo hacen, se les informa cuántas ventas les faltaron.
 */
public class CalculadoraVentas {

        public static void main(String args[]) {
            int ventas=10;
            System.out.print("Ingresa cantidad de ventas: ");
            Scanner sc = new Scanner(System.in);
            int cantidad= sc.nextInt();
            if(cantidad>=ventas)
                System.out.print("Felicidades");
            else{
                int resultado=ventas-cantidad;
                System.out.print("Te faltan "+ resultado+" ventas");
            }

            }
}
