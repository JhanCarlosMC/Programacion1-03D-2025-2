package co.edu.uniquindio.herenciapersona;

import static co.edu.uniquindio.herenciapersona.Cargo.GERENTE;

public class MainHerencia {

    public static void main(String[] args) {
//        Persona newPersona =
//                new Persona("321","Jhan", 24); //Error clase abstracta

        Empleado newEmpleado =
                new Empleado("123","Carlos",
                        24, 1000000, Cargo.AUXILIAR);

        Cliente newCliente =
                new Cliente("333","Mario", 24, "Todos");

        System.out.println(newEmpleado.getNombre());
        System.out.println(newCliente.getNombre());

    }
}
