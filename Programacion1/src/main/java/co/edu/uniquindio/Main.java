package co.edu.uniquindio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        Empresa nuevaEmpresa = new Empresa("UQ", "123");
//        boolean respuestaCreacion = nuevaEmpresa.agregarEmpleado("321", "Jhan",
//                "Ingeniero", "jcmc@uniquindio.edu.co",
//                "1223456", "Hoy");
//
//        JOptionPane.showMessageDialog(null, nuevaEmpresa.obtenerListaEmpleados());
//
//        if (respuestaCreacion) {
//            JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
//        } else {
//            JOptionPane.showMessageDialog(null, "Empleado no agregado");
//        }
//
//        boolean respuestaCreacion2 = nuevaEmpresa.agregarEmpleado("321", "Jhan",
//                "Ingeniero", "jcmc@uniquindio.edu.co",
//                "1223456", "Hoy");
//
//
//        if (respuestaCreacion2) {
//            JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
//        } else {
//            JOptionPane.showMessageDialog(null, "Empleado no agregado");
//        }
        test();
    }

    public static void test() {
        String mensaje = "Bienvenido al sistema gestor\n";
        mensaje += "\n 1.Crear Empleado\n" +
                "2.Eliminar Empleado\n" +
                "3.Actualizar Empleado\n" +
                "4.Buscar empleado por id.\n" +
                "5.Listar empleados\n" +
                "0.Salir\n";

        String op = JOptionPane.showInputDialog(null, mensaje);

        switch (op) {
            case "1":
                JOptionPane.showMessageDialog(null, "LLamado a creacion empleado");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "LLamado a eliminacion empleado");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "LLamado a actualizar empleado");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "LLamado a buscar empleado");
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "LLamado a listar empleados");
                break;
            case "0":
                JOptionPane.showMessageDialog(null, "LLamado a salir");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;

        }

    }
}
