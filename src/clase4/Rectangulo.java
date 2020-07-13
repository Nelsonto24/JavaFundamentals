package clase4;

//calcular área y perímetro de un rectángulo
//se usa métodos get y set para acceder a las variables privadas desde otra clase

public class Rectangulo {
     private double largo;
     private double ancho;

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
}
