package Clase7;

import java.util.Scanner;
import java.util.*;

public class ListaAlumnos {
        static boolean terminar=false;
        static String alumno;
        static Scanner sc=new Scanner(System.in);

    public static void main(String args[]) {
        listaAlumnos();
    }

    public static void listaAlumnos(){
        ArrayList alumnos=new ArrayList();
        while (!terminar) {
           System.out.println("Ingrese el nombre del alumno o la palabra ´terminar´ para finalizar");
           alumno = sc.next();
           if (alumno.equals("terminar")) {
             break;
           } else {
                alumnos.add(alumno);
                }
        }
        System.out.println();
        System.out.println("Lista de alumnos matriculados: ");
        for(int i=0;i<alumnos.size();i++){
            System.out.println(alumnos.get(i));
        }
        /*for(Object alum:alumnos){
            System.out.println(alum);
        }*/
    }
}


