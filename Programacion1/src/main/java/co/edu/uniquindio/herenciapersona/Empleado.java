package co.edu.uniquindio.herenciapersona;

import javax.sql.rowset.CachedRowSet;

public class Empleado extends Persona{
    private double salario;
    private Cargo cargo;

    public Empleado(String id, String nombre, int edad,
                    double salario, Cargo cargo) {
        super(id, nombre, edad);

        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public void caminar() {
        System.out.println("Camina seriamente...");
    }
}
