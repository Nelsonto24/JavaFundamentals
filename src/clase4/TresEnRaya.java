package clase4;

import java.util.Scanner;

public class TresEnRaya {
    static String tablero[][] = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    static boolean ganador = false;
    static String simbolo = "O";
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        while (!ganador) {
            if (simbolo.equals("X")) {
                simbolo = "O";
            } else {
                simbolo = "X";
            }

            System.out.print("Ingrese la posición de la fila de " + simbolo + " : ");
            int fila = sc.nextInt();
            System.out.print("Ingrese la posición de la columna de " + simbolo + " : ");
            int columna = sc.nextInt();
            tablero[fila][columna] = simbolo;

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(" | " + tablero[i][j]);
                    if (!tablero[i][j].equals(" ")) {
                        if (tablero[i][0].equals(tablero[i][1]) && tablero[i][0].equals(tablero[i][2])) {
                            ganador = true;
                        }
                        if (tablero[0][j].equals(tablero[1][j]) && tablero[1][j].equals(tablero[2][j])) {
                            ganador = true;
                        }
                    }
                }
                System.out.println(" | ");
            }

            if (tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2])) {
                ganador = true;
            }
            if (tablero[2][0].equals(tablero[1][1]) && tablero[2][0].equals(tablero[0][2])) {
                ganador = true;
            }
            if (ganador) {
                System.out.println("El ganador es " + simbolo);
            }
        }
    }
}


