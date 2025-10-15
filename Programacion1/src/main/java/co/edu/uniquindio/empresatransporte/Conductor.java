package co.edu.uniquindio.empresatransporte;

import java.util.LinkedList;

public class Conductor {
    private String cedula;
    private String nombre;
    private String catLicencia;
    private int aniosExperiencia;

    private Bus[] listBuses;
    private LinkedList<Bus> listBusesLinked;

    public Conductor(String cedula, String nombre, String catLicencia, int aniosExperiencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.catLicencia = catLicencia;
        this.aniosExperiencia = aniosExperiencia;
        listBusesLinked = new LinkedList<>();
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getCatLicencia() {
        return catLicencia;
    }

    public void setCatLicencia(String catLicencia) {
        this.catLicencia = catLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", catLicencia='" + catLicencia + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                '}';
    }

    public boolean agregarBus(Bus bus) {
        return listBusesLinked.add(bus);
    }

    public boolean eliminarBus(Bus bus) {
        return listBusesLinked.remove(bus);
    }

    public boolean actualizarBus(Bus bus, String placa) {

        for(Bus busIndex: listBusesLinked){
            if(busIndex.getPlaca().equals(placa)){
                busIndex.setPlaca(bus.getPlaca());
                busIndex.setModelo(bus.getModelo());
                busIndex.setCapPasajeros(bus.getCapPasajeros());
                busIndex.setTheConductor(bus.getTheConductor());

                return true;
            }
        }
        return false;
    }

    public void mostrarListaBuses() {
        for(int i = 0; i<listBusesLinked.size(); i++){
            System.out.println(listBusesLinked.get(i));
        }
    }
}
