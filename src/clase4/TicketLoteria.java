package clase4;

import java.util.Random;
import java.util.Scanner;

//Crear una aplicación que genere un ticket con 6 números aleatorios entre 1 al 69
public class TicketLoteria<N> {
    //private static final int LONGITUD = 6;
    private static final int MAXIMO_NUMERO_TICKET = 69;
    private static final Scanner scanner = new Scanner(System.in);
    private static int nro;

    public static void main(String[] args) {
        int[] ticket = generarNumeros();
        imprimirTicket(ticket);
    }

    public static int[] generarNumeros(){
        do{
            System.out.print("Ingrese cantidad de números a generar en fornma aleatoria: ");
            nro = scanner.nextInt();
        }while(nro<=0);
        int[] tk = new int[nro];
        Random nroAleatorio = new Random();
        for (int i=0; i<nro; i++){
            tk[i] = nroAleatorio.nextInt(MAXIMO_NUMERO_TICKET) + 1;
        }
        return tk;
    }

    public static void imprimirTicket(int ticket[]){
        for (int i= 0; i<ticket.length; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}