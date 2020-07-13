package clase5;

public class TestearHerencia {
    public static void main(String[] args) {
        //Empleado empleado=new Empleado();
        //empleado.getCargo();
        testCuadradoOverride();
        testOverLoad();
        Madre madre=new Madre();
        madre.setNombre("Delaida");
        System.out.println(madre.getNombre()+" es "+ madre.getGenero());

    }

    public static void testCuadradoOverride(){
        Rectangulo rectangulo=new Rectangulo();
        rectangulo.setLargo(5.2);
        rectangulo.setAncho(4.3);
        System.out.println("El perimetro del rectangulo es: "+rectangulo.calcularPerimetro());
        Cuadrado cuadrado=new Cuadrado();
        cuadrado.setLargo(6.4);
        cuadrado.setAncho(7.1);
        System.out.println("El perimetro del cuadrado es: "+cuadrado.calcularPerimetro());
    }

    public static void testOverLoad(){
        Rectangulo rectangulo=new Rectangulo();
        rectangulo.imprimir();
        Cuadrado cuadrado=new Cuadrado();
        cuadrado.imprimir("Cuadrado");
        }
}
