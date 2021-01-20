import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Arreglo {

    static int[][] matriz = {{4, 9, 8}, {8, 13, 7}, {3, 3, 27}};
    static List<Integer> lista= new ArrayList<>();

    public static void main(String args[]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 3 == 0)
                    lista.add(matriz[i][j]);
            }
        }
        lista = lista.stream().distinct().collect(Collectors.toList());
        System.out.println(lista);
    }
}

/*
        import java.util.ArrayList;
        import java.util.List;


public class Arreglo {
    public static void main(String[] args) throws Exception {
        int[][] matriz = {{4,9,8},{8,13,7},{3,3,27}};
        List<Integer> lista      = new ArrayList<>();

        for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                if(multiploTres(matriz[i][j])!=-1) {
                    if(esUnico(lista,matriz[i][j]))
                        lista.add(matriz[i][j]);
                }
            }
        }
        imprimir(lista);
    }


    private static int multiploTres(int numero){
        if(numero%3==0)
            return numero;
        else
            return -1;
    }

    private static Boolean esUnico(List<Integer> lista , int numero) {
        for (int i = 0 ; i<lista.size(); i++){
            if(lista.get(i)==numero)
                return false;
        }
        return true;
    }

    private static void imprimir(List lista) {
        for (int i = 0 ; i<lista.size(); i++){
            System.out.println(" " + lista.get(i));
        }
    }
}*/