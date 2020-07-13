package clase5;

public class Empleado extends Persona{
    private String idEmpleado;
    private String cargo;

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado(){
        super("Nelson");
        System.out.println("En clase Empleado el constructor por defecto");
    }
}
