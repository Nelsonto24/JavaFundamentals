package clase6;

public class Rectangulo2 extends Forma{
    protected double largo;
    protected double ancho;

    public Rectangulo2(double largo, double ancho){
        setLargo(largo);
        setAncho(ancho);
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    double calcularArea() {
        return largo*ancho;
    }
}
