package co.edu.uniquindio;

public class Empresa {
    // ------------- Atributos Propios-------------------
    private String nombre;
    private String nit;

    // ------------- Atributos de Relaciones -------------------
    private Empleado[] listEmpleados;

    // ------------- Constructor -------------------
    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        listEmpleados = new Empleado[10];
    }

    // ------------- CRUD -------------------

    public boolean agregarEmpleado(String numIdentificacion, String nombreCompleto,
                                   String puesto, String correo, String numTelefonico,
                                   String fechaContratacion){
        Empleado nuevoEmpleado =
                new Empleado(numIdentificacion, nombreCompleto, puesto,
                        correo, numTelefonico, fechaContratacion);

        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i] != null && listEmpleados[i].getNumIdentificacion().equals(numIdentificacion)) {
                return false;
            }
        }
        for (int i = 0; i < listEmpleados.length; i++) {
            if(listEmpleados[i] == null){
                listEmpleados[i] = nuevoEmpleado;
                return true;
            }
        }
        return false;
    }

    private int obtenerPosicionEmpleado(String numIdentificacion){
        for(int i = 0; i < listEmpleados.length; i++){
            if(listEmpleados[i] != null &&
                    listEmpleados[i].getNumIdentificacion().equals(numIdentificacion)){
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarEmpleado(String numIdentificacion){
        int indexEmpleado = obtenerPosicionEmpleado(numIdentificacion);

        if(indexEmpleado == -1) return false;

        listEmpleados[indexEmpleado] = null;
        return true;
    }

    public boolean actualizarEmpleado(String numIdentificacion, String nombreCompleto,
                                      String puesto, String correo, String numTelefonico,
                                      String fechaContratacion){

        int indexEmpleado = obtenerPosicionEmpleado(numIdentificacion);
        if(indexEmpleado == -1) return false;

        Empleado actualizarEmpleado = listEmpleados[indexEmpleado];

        actualizarEmpleado.setNombreCompleto(nombreCompleto);
        actualizarEmpleado.setPuesto(puesto);
        actualizarEmpleado.setCorreo(correo);
        actualizarEmpleado.setNumTelefonico(numTelefonico);
        actualizarEmpleado.setFechaContratacion(fechaContratacion);
        return true;
    }

    public Empleado obtenerEmpleado(String numIdentificacion){
        int indexEmpleado = obtenerPosicionEmpleado(numIdentificacion);
        if(indexEmpleado == -1) return null;

        return listEmpleados[indexEmpleado];
    }

    public Empleado[] obtenerListaEmpleados(){
        return listEmpleados;
    }

    // ------------- Getters And Setters -------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
