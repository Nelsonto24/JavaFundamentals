package Clase7;

import java.util.HashMap;
import java.util.Map;

public class ResultadoPruebas {
    public static Map getCalificaiconesOriginales() {
        Map<String, Integer> grades = new HashMap<>(); //no admite repetidos
        grades.put("Ramiro", 15);
        grades.put("Juan", 10);
        grades.put("Ricardo", 12);
        grades.put("Pedro", 9);
        grades.put("Luis", 11);
        return grades;
    }

    public static Map getCalificaiconesRecuperadas() {
        Map<String, Integer> grades = new HashMap<>(); //no admite repetidos
        grades.put("Ramiro", 10);
        grades.put("Juan", 20);
        grades.put("Ricardo", 12);
        grades.put("Pedro", 9);
        grades.put("Luis", 13);
        return grades;
    }
}