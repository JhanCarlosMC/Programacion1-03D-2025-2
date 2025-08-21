package co.edu.uniquindio;

public class Empleado {
    // ------------- Atributos -------------------
    private String numIdentificacion;
    private String nombreCompleto;
    private String puesto;
    private String correo;
    private String numTelefonico;
    private String fechaContratacion;

    // ------------- Constructor -------------------
    public Empleado(String numIdentificacion, String nombreCompleto,
                    String puesto, String correo, String numTelefonico,
                    String fechaContratacion) {

        this.numIdentificacion = numIdentificacion;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.correo = correo;
        this.numTelefonico = numTelefonico;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado {\n Identificacion: " + numIdentificacion + "\n Nombre completo: " + nombreCompleto +"}\n";
    }

    // ------------- Getters And Setters -------------------
    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}
