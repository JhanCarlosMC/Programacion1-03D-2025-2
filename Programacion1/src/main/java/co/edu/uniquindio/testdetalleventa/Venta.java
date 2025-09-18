package co.edu.uniquindio.testdetalleventa;

import java.time.LocalDate;

public class Venta {
    private String id;
    private LocalDate fecha;
    private double total;

    private DetalleVenta[] listDetallesVenta;

    public Venta(String id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
        listDetallesVenta = new DetalleVenta[10];
    }

    public void calcularTotalVenta(){
        double total = 0;
        for (DetalleVenta v : listDetallesVenta) {
            if(v != null){
                total += (v.getSubtotal());
            }
        }

        this.total = total;
    }

    public DetalleVenta[] getListDetallesVenta() {
        return listDetallesVenta;
    }

    public void agregarDetalleVenta(DetalleVenta detalleVenta) {

        for (int i = 0; i < listDetallesVenta.length; i++) {
            if(listDetallesVenta[i] == null){
                listDetallesVenta[i] = detalleVenta;
                return;
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
