package clase4;

public class calcularAreaRectangulo {

    public static void main(String[] args) {

        /***********
         * Rectangulo1
         * *********
         */
        //crear instancia de rectangulo1
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setAncho(25);
        rectangulo1.setLargo(50);
        double areaRectangulo1=rectangulo1.calcularArea();
        double perimetroRectangulo1=rectangulo1.calcularPerimetro();

        /***********
         * Rectangulo2
         * *********
         */
        //crear instancia de rectangulo2
        Rectangulo rectangulo2 = new Rectangulo(30,75);
        double areaRectangulo2=rectangulo2.calcularArea();
        double perimetroRectangulo2=rectangulo2.calcularPerimetro();

        double areaTotal=areaRectangulo1+areaRectangulo2;
        double perimetroTotal=perimetroRectangulo1+perimetroRectangulo2;

        System.out.println("El área total de los dos rectángulos es: "+ areaTotal);
        System.out.println("El perímetro total de los dos rectángulos es: "+ perimetroTotal);
    }
}
