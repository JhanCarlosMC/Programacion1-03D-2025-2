package co.edu.uniquindio.testdetalleventa;

public class DetalleVenta {
    private int cantidad;
    private double subtotal;

    private Producto theProducto;

    public DetalleVenta(int cantidad, Producto theProducto) {
        this.cantidad = cantidad;
        this.theProducto = theProducto;
        calcularSubtotal();
    }

    public void calcularSubtotal() {
        this.subtotal = cantidad * theProducto.getPrecio();
    }

    public Producto getTheProducto() {
        return theProducto;
    }

    public void setTheProducto(Producto theProducto) {
        this.theProducto = theProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
