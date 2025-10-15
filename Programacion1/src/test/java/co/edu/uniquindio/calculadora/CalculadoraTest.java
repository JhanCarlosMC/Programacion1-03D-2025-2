package co.edu.uniquindio.calculadora;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private static final Logger LOG = Logger.getLogger(CalculadoraTest.class.getName());

    @Test
    public void creacionCalculadora(){
        LOG.info("Inicio test de creacionCalculadora");

        Calculadora newCalculadora =
                new Calculadora("Casio", 60000.0);

        assertNotNull(newCalculadora);

        LOG.info("Fin test de creacionCalculadora");
    }

    @Test
    public void sumarTest(){
        LOG.info("Inicio test de sumarTest");
        Calculadora newCalculadora =
                new Calculadora("Casio", 60000.0);

        double resultado = newCalculadora.sumar(2,2);
        
        assertEquals(resultado, 4);

        LOG.info("Fin test de sumarTest");
    }

}