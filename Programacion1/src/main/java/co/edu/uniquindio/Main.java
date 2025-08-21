package co.edu.uniquindio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Empresa nuevaEmpresa = new Empresa("UQ", "123");
        boolean respuestaCreacion = nuevaEmpresa.agregarEmpleado("321", "Jhan",
                "Ingeniero", "jcmc@uniquindio.edu.co",
                "1223456","Hoy");

        JOptionPane.showMessageDialog(null, nuevaEmpresa.obtenerListaEmpleados());

        if (respuestaCreacion) {
            JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Empleado no agregado");
        }

        boolean respuestaCreacion2 = nuevaEmpresa.agregarEmpleado("321", "Jhan",
                "Ingeniero", "jcmc@uniquindio.edu.co",
                "1223456","Hoy");


        if (respuestaCreacion2) {
            JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Empleado no agregado");
        }
    }
}
