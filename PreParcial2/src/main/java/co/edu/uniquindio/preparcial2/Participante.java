package co.edu.uniquindio.preparcial2;

import java.time.LocalDate;

public class Participante extends Persona{

    protected int edad;
    protected String paisRepresentacion;
    protected int cantEventos;

    private EventoDeportivo theEventoDeportivo;

    public Participante(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String paisRepresentacion, int edad, int cantEventos) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.edad = edad;
        this.paisRepresentacion = paisRepresentacion;
        this.cantEventos = cantEventos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPaisRepresentacion() {
        return paisRepresentacion;
    }

    public void setPaisRepresentacion(String paisRepresentacion) {
        this.paisRepresentacion = paisRepresentacion;
    }

    public int getCantEventos() {
        return cantEventos;
    }

    public void setCantEventos(int cantEventos) {
        this.cantEventos = cantEventos;
    }
}
