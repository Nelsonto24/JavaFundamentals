package clase6;

import java.security.cert.CollectionCertStoreParameters;
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

        List frutas2=new ArrayList(); //admite valores repetidos ArrayList x=new ArrayList();
        frutas2.add("manzana");
        frutas2.add("limon");
        frutas2.add("naranja");
        frutas2.add("platano");
        frutas2.add("limon");
        //frutas2.removeAll(frutas2); devuelve un boolean
        //frutas2.clear();
        System.out.println(frutas2.size());
        System.out.println(frutas2.get(2));
        System.out.println(frutas2);
        Object listaClonada= ((ArrayList) frutas2).clone();
        System.out.println("Lista clonada: "+listaClonada);
        int indice=frutas2.indexOf("limon");
        System.out.println("Posición con valor limón es:"+ indice); //si no lo encuentra, devuelve -1
        Collections.sort(frutas2);
        System.out.println("Lista ordenada:"+ frutas2);

        /*
        //obtener y setear registros
        Arraylist<String> frutas2=new ArrayList<>(); ...

        String obtener=frutas2.get(0);
        System.out.println("El registro en el índice 0 es:" +obtener);

        frutas2.set(6,"Pera");
        System.out.println("Lista corregida:" +frutas2);
        */

        //llevar de una lista a un arreglo
        Object[] objArreglo=frutas2.toArray();
        for(Object obj:objArreglo) //for(int i=0; i<objArreglo.length;i++)|
            System.out.println("Contenido del arreglo: "+ obj);

        String arreglo[]= {"Trujillo", "Lima", "Ica"};
        List list=Arrays.asList(arreglo);
        ArrayList a=new ArrayList(list);
        for(Object b:a){
            System.out.println("Elemento: "+b);
        }
        System.out.println(a);

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
        //frutaCalorias.remove("manzana"); se elimina a través de la llave
        System.out.println("El valor de la llave naranja es: "+ frutaCalorias.get("naranja"));

        Set<String> miSet=new HashSet<>();
        miSet=frutaCalorias.keySet();  //devuelve el conjunto de llaves que existe en un mapa
        System.out.println("KeySet: "+miSet);
    }
}
