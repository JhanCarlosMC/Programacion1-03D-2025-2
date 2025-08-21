package co.edu.uniquindio;

public class Test {
//    public static void main(String[] args) {
//        //Variables
//        int var1 = 10; //Declaracion y Asignacion
//        int var2; //Declaracion
//        var2 = 20; //Asignacion
//
////        Tipos de datos
//        int numberoEntero = 10;
//        double numeroDecimal = 20.0;
//        boolean datoLogico = true;
//        String datoString = "Hola";
//
//        //Operadores Aritmeticos
//        //+ / * - % =
//        //Operadores Logicos
//        // && || !
//        //Operadores Relacionales
//        // < <= > >= == !=
//
//        //Casting - COnversion de datos
//        String numeroString = "10";
//        int vat2 = Integer.parseInt(numeroString); //Conversion a int
//
//        int numeroInt = 10;
//        String var3 = String.valueOf(numeroInt); //Conversion a String
//
//        //Estructuras condicionales
//        if (condicion) {
//            //En Caso de verdadero
//        } else {
//            //En caso de falso
//        }
//
//        if (condicion) {
//
//        }
//        if (condicion) {
//
//        } else {
//            if (condicion) {
//            } else {
//            }
//        }
//
//
//        switch (option) {
//            case 1:
//                //Codigo
//                break;
//
//            case 2:
//                break;
//
//            default:
//                break;
//        }
//
//        //Estructuras ciclicas
//        for (int i = 0; i < var1; i++) {
//            //codigo
//        }
//
//        int i = 0;
//        while(i<var1) {
//            i++;
//        }
//
//        int j = 0;
//        do {
//            j++;
//        }while (j <= var1);
//
//
//    }

    //Metodo
    //ModificadorAcceso TipoRetorno NombreMetodo(Parametros){
    //Codigo
    //}
    public int sumar(int valor1, int valor2) {
        return 0;
    }

    public void resta(int valor1, double valor2) {
    }

    public int factorial(int numero) {
        int fact = 1;
        for(int i = numero; i>0; i--) {
            fact *= i;
        }
        return fact;
    }

    public int factorial2(int numero) {
        int fact = 1;
        while(numero > 0) {
            fact *= numero;
            numero--;
        }
        return fact;
    }

    public int factorial3(int numero) {
        int fact = 1;
        for(int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }

    public void arreglos(){
        int[] arregloEnteros = new int[10];

        arregloEnteros[0] = 1;

        for( int i = 0; i<arregloEnteros.length; i++){
            arregloEnteros[i] = i + 1;
        }

        for( int i = 0; i<arregloEnteros.length; i++){
            System.out.println(arregloEnteros[i]);
        }

    }
}