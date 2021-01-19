package Clase7;

import java.util.Map;

public class LibretaCalificaciones {
    public static void main(String[] args) {
        Map<String, Integer> libretaCalificaciones=ResultadoPruebas.getCalificaiconesOriginales();
        Map<String, Integer> calificacionesRecuperadas=ResultadoPruebas.getCalificaiconesRecuperadas();
        for(Map.Entry<String, Integer> estudiante:calificacionesRecuperadas.entrySet()){
            Integer primeraCalificacion= libretaCalificaciones.get(estudiante.getKey());
            Integer segundaCalificacion= estudiante.getValue(); //calificacionesRecuperadas.get(estudiante.getKey());
            if(segundaCalificacion>primeraCalificacion){
                libretaCalificaciones.put(estudiante.getKey(), segundaCalificacion);
            }
        }
        System.out.println("Calificaciones finales:");
        libretaCalificaciones.forEach(
                (k, v) -> System.out.println("Estudiante "+k+"; su calificación es "+v)
        );
    }

}
