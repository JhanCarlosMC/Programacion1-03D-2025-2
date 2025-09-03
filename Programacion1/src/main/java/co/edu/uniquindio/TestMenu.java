package co.edu.uniquindio;

import javax.swing.*;

public class TestMenu {
    public static void main(String[] args) {

        boolean flag = true;
        do {
            String op = (JOptionPane.showInputDialog("Ingrese una opcion: " +
                    "\n 1. Crud Propietario" +
                    "\n 2. Crud Mascota" +
                    "\n\n salir"));
            switch (op) {
                case "1":
                    crudPropietario();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Opcion 2");
                    break;
                case "salir":
                    flag = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
                    break;
            }
        } while (flag);

    }

    public static void crudPropietario() {
        String op = (JOptionPane.showInputDialog("Ingrese una opcion: " +
                "\n CRUD Propietario" +
                "\n 1. Crear Propietario" +
                "\n 2. Eliminar Propietario" +
                "\n 3. Mostrar Propietario" +
                "\n 4. Actualizar Propietario" +
                "\n\n salir"));
        switch (op) {
            case "1":
                JOptionPane.showMessageDialog(null, "Creando propietario...");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Eliminando propietario...");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Mostrando propietario...");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Actualizando propietario..");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
                break;
        }
    }
}

