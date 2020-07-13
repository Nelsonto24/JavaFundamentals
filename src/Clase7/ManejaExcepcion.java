package Clase7;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ManejaExcepcion {
    public static void main(String[] args) {
        crearNuevoArchivo();
        nrosmanejarExcepciones();
        try {
            crearNuevoArchivoReintentar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void crearNuevoArchivo() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("El directorio no existe");
            // System.out.println("El directorio no existe "+ e.getMessage(); es lo mismo que la línea anterior
            e.printStackTrace();
        }
    }

    public static void nrosmanejarExcepciones() {
        File file = new File("resources/numeros.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void crearNuevoArchivoReintentar() throws IOException {
        File file = new File("archivo.txt");
        file.createNewFile();
    }
}

