package co.edu.uniquindio.testdetalleventa;

public class Producto {
    private String nombre;
    private double precio;

    private DetalleVenta[] listDetallesVenta;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        listDetallesVenta = new DetalleVenta[10];
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
