package clase6;

public class TesterForma {
    public static void main(String[] args) {
        Forma rectangulo= new Rectangulo2(5,7); // no se debe instanciar a una clase abstracta (forma), sino a otra clase que usó la herencia
        rectangulo.imprimir();
        System.out.println(rectangulo.calcularArea());

    }
}
