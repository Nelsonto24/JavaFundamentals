package clase5;
//Escriba un método que cuente el número de palabras en una cadena y las imprima individualmente en una nueva línea

public class ProcesadorTexto {
    public static void main(String[] args) {
        contarPalabras("A mi me gusta la automatización de pruebas");
        revertirString("quiero una manzana");
        agregarEspacios("Hola!EstamosAutomatizandoElMundo!");
    }

    public static void contarPalabras(String texto) {
        String palabras[] = texto.split(" ");
        int nroPalabras = palabras.length;
        String mensaje = String.format("Su texto contiene %d palabras", nroPalabras);
        System.out.println(mensaje);
        for (int i = 0; i < nroPalabras; i++) {
            System.out.println(palabras[i]);
        }
        //System.out.println("");
    }

    /**
     * Imprime un String en orden reverso
     *
     * @param texto String para revertir
     */
    public static void revertirString(String texto) {
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println("");
    }

    /**
     * Agrega espacios antes de cada letra mayúscula
     *
     * @param texto texto mezclado
     */
    public static void agregarEspacios(String texto) {
        StringBuilder textoModificado = new StringBuilder(texto);
        for (int i = 0; i<textoModificado.length(); i++) {
            if (i!=0 && Character.isUpperCase(textoModificado.charAt(i))) {
                textoModificado.insert(i," ");
                i++;
            }
        }  System.out.println(textoModificado);
    }
}
