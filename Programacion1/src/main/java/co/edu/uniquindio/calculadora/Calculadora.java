package co.edu.uniquindio.calculadora;

import java.util.LinkedList;

public class Calculadora {
    private String nombre;
    private double precio;
    private LinkedList<Integer> historialCalculos = new LinkedList<>();

    public Calculadora(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public boolean agregarResultado(int resultado) {
        return historialCalculos.add(resultado);
    }

    public int obtenerCantidadResultados() {
        return historialCalculos.size();
    }

    public double sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double restar(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
