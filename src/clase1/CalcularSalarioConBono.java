package clase1;

import java.util.Scanner;
/* Todos los vendedores reciben un pago de S/1000 por semana.
Los vendedores que superen las 10 ventas obtienen un bono adicional de S/250.
 */
public class CalcularSalarioConBono {
    public static void main(String args[]) {
        int salario = 1000;
        int cantidad = 10;
        int bono = 250;
        System.out.print("Ingresa cantidad de ventas del producto: ");
        Scanner sc = new Scanner(System.in);
        int ventas = sc.nextInt();
        sc.close();
        if (ventas>cantidad)
            System.out.print("Sueldo: " + (salario + bono));
        else
            System.out.println("Sueldo: " + salario);
    }
}
