package Clase7;

import java.util.HashMap;
import java.util.Map;

public class cursos {

    public static void main(String args[]){
        Map<String, Integer> cursos=new HashMap<>();
        cursos.put("Java básico", 6);
        cursos.put("Java intermedio", 7);
        cursos.put("Java avanzado", 5);
        cursos.put("Serenity", 2);
        System.out.println("Total de cursos: "+ cursos.size());
        for(Map.Entry<String, Integer> entry:cursos.entrySet()){
            System.out.println(entry.getKey()+ ": "+ entry.getValue());
        }
        System.out.println();
        String llave="Java intermedio";
        System.out.println("Se encontraron en total "+cursos.get(llave)+" cursos "+ llave);
    }
}
