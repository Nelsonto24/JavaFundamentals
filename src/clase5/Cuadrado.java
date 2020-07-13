package clase5;

public class Cuadrado extends Rectangulo {
    @Override
    public double calcularPerimetro() {
        return lados * largo;
    }

    public void imprimir(String objeto){
        System.out.println("Yo soy un "+objeto);
    }
}
