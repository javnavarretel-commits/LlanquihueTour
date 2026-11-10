package model;

public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String rut, String correo,
                    String telefono, Direccion direccion,
                    String cargo, double sueldo) {

        super(nombre, rut, correo, telefono, direccion);

        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado" +
                "nombre:'" + getNombre() + '\'' +
                ", rut:'" + getRut() + '\'' +
                ", correo:'" + getCorreo() + '\'' +
                ", telefono:'" + getTelefono() + '\'' +
                ", direccion:" + getDireccion() +
                ", cargo:'" + cargo + '\'' +
                ", sueldo:" + sueldo +
                '}';
    }

}
