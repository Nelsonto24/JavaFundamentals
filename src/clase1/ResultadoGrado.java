package clase1;

import java.util.Scanner;
/*
 Muestre el grado de un estudiante en función a su puntaje en la prueba.
 */
public class ResultadoGrado {
    public static void main(String args[]) {
        System.out.print("Ingresa puntaje obtenido: ");
        Scanner sc = new Scanner(System.in);
        int puntaje = sc.nextInt();
        if (puntaje < 60)
            System.out.print("Grado F");
        else{
            if (puntaje < 70)
                System.out.print("Grado D");
            else{
                if (puntaje < 80)
                System.out.print("Grado C");
                else{
                    if (puntaje < 90)
                    System.out.print("Grado B");
                    else{
                        System.out.print("Grado A");}
                }
            }
        }
    }
 }


