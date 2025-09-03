package co.edu.uniquindio.empresatransporte;

public class Bus {
    //------------ Atrubutos Propios
    private String placa;
    private String modelo;
    private String tipo;
    private int capPasajeros;

    //------------ Atrubutos de relacion
    private Conductor theConductor;


    // ------------ Constructor
    public Bus(String placa, String modelo, String tipo, int capPasajeros) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.capPasajeros = capPasajeros;
    }

    // ------------ Getters and Setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapPasajeros() {
        return capPasajeros;
    }

    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public Conductor getTheConductor() {
        return theConductor;
    }

    public void setTheConductor(Conductor theConductor) {
        this.theConductor = theConductor;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "theConductor=" + theConductor.getNombre() +
                ", capPasajeros=" + capPasajeros +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
