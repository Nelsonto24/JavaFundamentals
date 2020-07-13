package clase1;

import java.util.Scanner;

public class CalcularSalarioBruto {
    public static void main(String args[]) {
        //1. Obtener el número de horas trabajadas
        System.out.print("Ingresa cantidad de horas trabajadas: ");
        Scanner scanner=new Scanner(System.in);
        int horas= scanner.nextInt();
        //2. Obtener la tarifa de pago por hora
        System.out.print("Ingresa tarifa de pago por hora: ");
        double tarifa= scanner.nextDouble();
        //3. Multiplicar las horas por la tarifa
        double resultado = horas * tarifa;
        //4. Mostrar resultado
        System.out.print("El resultado es: " + resultado);

    }
}