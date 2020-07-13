package clase6;

public interface Producto {
    double getPrecio();
    void setPrecio(double precio);
    String getNombre();
    void setNombre(String nombre);
    String getColor();
    void setColor(String color);
   /* public void imprimir(){  //en una clase abstracta se puede definir éste tipo de métddos
        System.out.println("Yo soy una forma");
    }    No se puede realizar éste tipo de declaración */
    default String getCodigoBarras(){
        return "No tiene código de barras";
    }

}
