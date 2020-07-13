package clase4;

import java.util.Scanner;

public class calcularAreaNueva {
    private Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        calcularAreaNueva calcularAreaNueva=new calcularAreaNueva();
        Rectangulo cocina=calcularAreaNueva.getRectangulo("cocina");
        Rectangulo baño=calcularAreaNueva.getRectangulo("baño");
        double area=calcularAreaNueva.calcularAreaTotal(cocina, baño);
        System.out.println("El area total es: "+area);
        calcularAreaNueva.scanner.close();
    }

    public Rectangulo getRectangulo(String ambiente){
        System.out.println("Ingrese el largo del rectángulo para tu "+ambiente);
        double largo=scanner.nextDouble();
        System.out.println("Ingrese el ancho del rectángulo para tu "+ambiente);
        double ancho=scanner.nextDouble();
        /* Rectangulo rectangulo=new Rectangulo();
        rectangulo.setLargo(largo);
        rectangulo.setAncho(ancho);
        return rectangulo;  */
        return new Rectangulo(largo, ancho);
    }

    public double calcularAreaTotal(Rectangulo rectangulo1, Rectangulo rectangulo2){
        return rectangulo1.calcularArea()+rectangulo2.calcularArea();
    }
}
