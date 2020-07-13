package Clase7;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Coleccciones2 {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }
        public static void setDemo(){
            Set<String> frutas = new HashSet<>(); //no admite valores repetidos
            frutas.add("manzana");
            frutas.add("limon");
            frutas.add("platano");
            frutas.add("naranja");
            frutas.add("limon");
            System.out.println(frutas.size());
            System.out.println(frutas);
            Iterator i=frutas.iterator(); //1era forma de recorrer la colección
            while(i.hasNext()){ //existe otro elemento en el conjunto? si es sí, imprime
                System.out.println(i.next());
            }
            for(String item:frutas){ //el diamante se coloca al instanciar por el tipo de elemento, si no se coloca, lo asigna como clase object
                System.out.println(item); //2da forma de recorrer la colección
            }
            frutas.forEach(x -> System.out.println(x)); // expresión landa, 3era forma de recorrer la colección
            frutas.forEach(System.out::println); //mismo resultado que en la línea anterior pero con otra forma de expresión
    }

        public static void listDemo() {
            List frutas2 = new ArrayList(); //admite valores repetidos
            frutas2.add("manzana");
            frutas2.add("limon");
            frutas2.add("platano");
            frutas2.add("naranja");
            frutas2.add("limon");
            System.out.println(frutas2.size());
            System.out.println(frutas2.get(2));
            System.out.println(frutas2);
        }

    public static void queueDemo() {
        Queue frutas3 = new LinkedList();
        frutas3.add("piña");
        frutas3.add("pera");
        frutas3.add("mandarina");
        frutas3.add("melocoton");
        frutas3.remove();
        System.out.println(frutas3.remove()); //FIFO - primero en entrar, primero en salir
        System.out.println(frutas3.size());
        System.out.println(frutas3);
        System.out.println(frutas3.peek());
    }

    public static void mapDemo(){
        Map<String, Integer> frutaCalorias=new HashMap<>(); //no admite repetidos
        frutaCalorias.put("manzana",95);
        frutaCalorias.put("limon",20);
        frutaCalorias.put("platano",105);
        frutaCalorias.put("naranja",45);
        frutaCalorias.put("limon",17);
        System.out.println(frutaCalorias.size());
        System.out.println(frutaCalorias);
        System.out.println(frutaCalorias.get("limon"));
        System.out.println(frutaCalorias.entrySet());
        for(Map.Entry<String, Integer> entry:frutaCalorias.entrySet()){
            System.out.println("key "+ entry.getKey()+"; Valor: "+entry.getValue());
        }
        frutaCalorias.forEach(
                (k, v)-> System.out.println("Fruta "+k+"; Calorías: "+v) //equivalente a la línea anterior
        );
    }
}
