package co.edu.uniquindio.empresatransporte;

public class Main {

    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte("UQ", "123");
        cargarDatos(empresaTransporte);


    }

    public static void cargarDatos(EmpresaTransporte empresaTransporte) {
        Conductor newConductor1 = new Conductor("123", "Jhan", "C2", 5);
        empresaTransporte.agregarConductor(newConductor1);

        Bus newBus1 = new Bus("EIS313", "2000", "Intermunicipal",30);
        empresaTransporte.agregarBus(newBus1);
    }
}
