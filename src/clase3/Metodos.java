package clase3;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre=sc.nextLine();
        saludarUsuario(nombre);
        String mensaje=getMensaje(nombre);
        System.out.println(mensaje);
    }

    public static void saludarUsuario(String name){

        System.out.println("Hola "+name);
    }
    public static String getMensaje (String name){
        String texto="Bienvenido "+name;
        return texto;
    }
}
