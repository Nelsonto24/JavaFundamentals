package clase4;

import java.util.Scanner;

public class Matrices {
    private static Scanner sc = new Scanner(System.in);
    private static int f, c;

    public static void main(String args[]) {
        imprimirMatriz();
        System.out.println("");
        llenarMatriz();
        completarMatriz();
        columnasAleatorias();
        sumaMatrices();
    }

    public static void imprimirMatriz() {
        int matriz[][] = {{1, 2, 3}, {4, 5, 6, 7}, {1, 2}, {7, 8, 9, 10, 11}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("| " + matriz[i][j]);
            }
            System.out.println(".");
        }
    }

    public static void llenarMatriz() {
        int matriz2[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                matriz2[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(" | " + matriz2[i][j]);
            }
            System.out.println(".");
        }
    }

    public static void completarMatriz() {
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        f = sc.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        c = sc.nextInt();
        int matriz3[][] = new int[f][c];
        int m, n, l = 0;
        for (m = 0; m < f; m++) {
            for (n = 0; n < c; n++) {
                matriz3[m][n] = l;
                l++;
            }
        }
        for (m = 0; m < f; m++) {
            for (n = 0; n < c; n++) {
                System.out.print(" | " + matriz3[m][n]);
            }
            System.out.println(".");
        }
    }

    public static void columnasAleatorias() {
        System.out.print("Ingrese el número de columnas");
        int col = sc.nextInt();
        int matriz4[][] = new int[5][col];

        for (int a = 0; a < matriz4.length; a++) {
            for (int b = 0; b < matriz4[0].length; b++) {
                matriz4[a][b] = (int) Math.floor(Math.random() * (0 - (col + 1)) + (col + 1));
                System.out.print(" | " + matriz4[a][b]);
            }
            System.out.println(".");
        }
    }

    public static void sumaMatrices() {
        System.out.println("Ingresa el tamaño de la matriz");
        int tamaño = sc.nextInt();
        int matriz5[][] = new int[tamaño][tamaño];
        int matriz6[][] = new int[tamaño][tamaño];
        int resultado[][] = new int[tamaño][tamaño];
        for (int i = 0; i < matriz5.length; i++) {
            for (int j = 0; j < matriz5[0].length; j++) {
                System.out.println("Ingresa el valor de la fila " + i + " y la columna "+ j+" de la matriz 1");
                matriz5[i][j] = sc.nextInt();
                System.out.println("Ingresa el valor de la fila " + i + " y la columna "+ j+" de la matriz 2");
                matriz6[i][j] = sc.nextInt();
                resultado[i][j] = matriz5[i][j] + matriz6[i][j];
            }
        }
        System.out.println("Matriz 1");
        mostrarMatriz(matriz5);
        System.out.println("");
        System.out.println("Matriz 2");
        mostrarMatriz(matriz6);
        System.out.println("");
        System.out.println("Matriz resultado");
        mostrarMatriz(resultado);
        System.out.println("");
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" | " + matriz[i][j]);
            }
            System.out.println(".");
        }
    }
}



