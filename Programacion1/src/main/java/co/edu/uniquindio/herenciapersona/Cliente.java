package co.edu.uniquindio.herenciapersona;

public class Cliente extends Persona {

    private String beneficio;

    public Cliente(String id, String nombre, int edad, String beneficio) {
        super(id, nombre, edad);

        this.beneficio = beneficio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

}
