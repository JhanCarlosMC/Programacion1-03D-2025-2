package co.edu.uniquindio.testdetalleventa;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Producto newProducto = new Producto("Tomate", 1000);
        Producto newProducto2 = new Producto("Gaseosa", 5000);

        LocalDate date = LocalDate.now();

        Venta newVenta = new Venta("V01", date);

        DetalleVenta detalleUno = new DetalleVenta(3, newProducto);
        DetalleVenta detalleDos = new DetalleVenta(2, newProducto2);

        newVenta.agregarDetalleVenta(detalleUno);
        newVenta.agregarDetalleVenta(detalleDos);

        newVenta.calcularTotalVenta();

        System.out.println(newVenta.getTotal());
    }
}
