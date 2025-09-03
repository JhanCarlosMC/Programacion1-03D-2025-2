package co.edu.uniquindio.empresatransporte;

public class Conductor {
    private String cedula;
    private String nombre;
    private String catLicencia;
    private int aniosExperiencia;

    private Bus[] listBuses;

    public Conductor(String cedula, String nombre, String catLicencia, int aniosExperiencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.catLicencia = catLicencia;
        this.aniosExperiencia = aniosExperiencia;
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
}
