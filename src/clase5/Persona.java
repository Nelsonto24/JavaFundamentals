package clase5;

public class Persona {
    private String nombre = "Pedro";
    private int edad;
    private String genero;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Persona(String nombre) {
        System.out.println("Se está estableciendo el nombre en el constructor de la clase Persona " + nombre);
    }
}
