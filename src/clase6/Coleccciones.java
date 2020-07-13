package clase6;

import java.util.*;

public class Coleccciones {
    public static void main(String[] args) {
        Set frutas = new HashSet(); //no admite valores repetidos
        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        System.out.println(frutas.size());
        System.out.println(frutas);

        List frutas2=new ArrayList(); //admite valores repetidos
        frutas2.add("manzana");
        frutas2.add("limon");
        frutas2.add("platano");
        frutas2.add("naranja");
        frutas2.add("limon");
        System.out.println(frutas2.size());
        System.out.println(frutas2.get(2));
        System.out.println(frutas2);

        Queue frutas3=new LinkedList();
        frutas3.add("piña");
        frutas3.add("pera");
        frutas3.add("mandarina");
        frutas3.add("melocoton");
        frutas3.remove();
        System.out.println(frutas3.remove()); //FIFO - primero en entrar, primero en salir
        System.out.println(frutas3.size());
        System.out.println(frutas3);
        System.out.println(frutas3.peek());  //obtiene primer registro

        Map frutaCalorias=new HashMap(); //no admite repetidos
        frutaCalorias.put("manzana",95);
        frutaCalorias.put("limon",20);
        frutaCalorias.put("platano",105);
        frutaCalorias.put("naranja",45);
        frutaCalorias.put("limon",17);
        System.out.println(frutaCalorias.size());
        System.out.println(frutaCalorias);
        System.out.println(frutaCalorias.get("limon"));
        System.out.println(frutaCalorias.entrySet());


    }
}
