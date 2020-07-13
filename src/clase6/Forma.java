package clase6;

public abstract class Forma {
    abstract double calcularArea(); //se declara solo métodos pero no implementarlos

    public void imprimir(){  //en una clase abstracta se puede definir éste tipo de métddos
        System.out.println("Yo soy una forma");
    }
}
