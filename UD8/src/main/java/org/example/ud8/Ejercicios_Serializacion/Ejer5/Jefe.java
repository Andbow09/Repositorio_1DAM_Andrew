package org.example.ud8.Ejercicios_Serializacion.Ejer5;

public class Jefe extends Empleado{
    private String departamento;

    public Jefe(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + super.getNombre() + '\'' +
                ", salario=" + super.getSalario() + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
