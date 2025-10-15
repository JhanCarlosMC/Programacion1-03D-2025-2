package co.edu.uniquindio.preparcial2;

import java.time.LocalDate;
import java.util.LinkedList;

public class EventoDeportivo {
    private String nombre;
    private LocalDate fechaInicio;
    private String ubicacion;
    private String deporte;

    private LinkedList<Participante> listParticipante;

    public EventoDeportivo(String nombre, String ubicacion, String deporte, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.deporte = deporte;
        this.fechaInicio = fechaInicio;
        listParticipante = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public LinkedList<Participante> getListParticipante() {
        return listParticipante;
    }

    public void setListParticipante(LinkedList<Participante> listParticipante) {
        this.listParticipante = listParticipante;
    }
}
