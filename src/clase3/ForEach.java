package clase3;

import java.util.function.DoubleToIntFunction;
//cuando no se conoce el tamaño de la colección, se usa el for each
public class ForEach {
    public static void main(String args[]) {
        int[] valores = new int[3];
        valores[0] = 10;
        valores[1] = new Integer(5);
        //valores[1] = 3;
        valores[2] = 15;
        for (int i = 1; i<valores.length; i++){
            //System.out.print(valores[i]+", "); en la 1era vuelta imprime el número(3) de la posición 1 ya que i=1
            System.out.print((valores[i] - valores[i - 1]) + ", ");

        }
    }}
    /*
        //String[] nombres=new String [3];
        String [] nombres=new String[] {"María", "Claudia"};
        nombres[0]="José";
        nombres[1]="Pedro";
        nombres[2]="Julio";
        for(String nombre: nombres){ //el bucle for each dará error cuando la colección no es array
            System.out.print(nombre+ ", ");
        }
    }
}*/
