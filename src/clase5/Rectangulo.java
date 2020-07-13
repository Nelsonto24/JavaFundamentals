package clase5;

//calcular área y perímettro de un rectángulo
//se usa métodos get y set para acceder a las variables privadas de otra clase

public class Rectangulo {
    protected double largo;
    private double ancho;
    protected double lados=4;

    /*public Rectangulo(){
        this.largo=0;
        this.ancho=0;
    }*/

    public Rectangulo(){
    }

    public Rectangulo(double largo, double ancho){
        //this.largo=largo; //forma1
        //this.ancho=ancho;
        setLargo(largo);
        setAncho(ancho);  //forma2
    }

    public double getLargo(){
        return largo;
    }

    public void setLargo(double largo1){
        this.largo=largo1;
    }

    public double getAncho(){
        return ancho;
    }

    public void setAncho(double ancho1){
        this.ancho=ancho1;
    }

    public double calcularArea(){
        return largo*ancho;
    }

    public double calcularPerimetro(){
        return (2*largo)+(2*ancho);
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public void imprimir(){
        System.out.println("Yo soy un rectangulo");
    }
}
