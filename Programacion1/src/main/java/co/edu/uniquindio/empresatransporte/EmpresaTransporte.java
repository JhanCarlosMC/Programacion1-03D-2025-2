package co.edu.uniquindio.empresatransporte;

import java.util.Arrays;

public class EmpresaTransporte {

    private String nombre;
    private String nit;

    private Bus[] listBuses;
    private Conductor[] listConductors;

    public EmpresaTransporte(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        listBuses = new Bus[30];
        listConductors = new Conductor[50];
    }

    // ----------------- CRUD Conductor -------------------
    public boolean agregarConductor(String cedula, String nombre, String catLicencia, int aniosExperiencia) {

        if (buscarConductor(cedula) == -1) return false;

        Conductor newConductor = new Conductor(cedula, nombre, catLicencia, aniosExperiencia);

        for (int i = 0; i < listConductors.length; i++) {
            if (listConductors[i] == null) {
                listConductors[i] = newConductor;
                return true;
            }
        }
        return false;
    }

    private int buscarConductor(String cedula) {
        for (int i = 0; i < listConductors.length; i++) {
            if (listConductors[i].getCedula().equals(cedula)) {
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarConductor(String cedula) {
        if (!buscarConductor(cedula)) {
            for (int i = 0; i < listConductors.length; i++) {
                if (listConductors[i].getCedula().equals(cedula)) {
                    listConductors[i] = null;
                    return true;
                }
            }
            return false;
        }

        public boolean actualizarConductor (String cedula, String nombre, String catLicencia,int aniosExperiencia){
            for (int i = 0; i < listConductors.length; i++) {
                if (listConductors[i].getCedula().equals(cedula)) {
                    listConductors[i].setNombre(nombre);
                    listConductors[i].setCatLicencia(catLicencia);
                    listConductors[i].setAniosExperiencia(aniosExperiencia);
                    return true;
                }
            }
            return false;
        }

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getNit () {
            return nit;
        }

        public void setNit (String nit){
            this.nit = nit;
        }

        @Override
        public String toString () {
            return "EmpresaTransporte{" +
                    "nombre='" + nombre + '\'' +
                    ", nit='" + nit + '\'' +
                    '}';
        }
    }
