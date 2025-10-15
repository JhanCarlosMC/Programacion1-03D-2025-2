import co.edu.uniquindio.preparcial2.EventoDeportivo;
import co.edu.uniquindio.preparcial2.Participante;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class EventoDeportivoTest {

    Logger LOG = Logger.getLogger(EventoDeportivoTest.class.getName());
    @Test
    public void testCreateEvent(){

        LOG.info("Inicio de prueba");

        EventoDeportivo newEvent = new EventoDeportivo
                ("UQ Sport", "Universidad del quidnio", "Atletismo", LocalDate.now());

        assertNotNull(newEvent);

        LOG.info("Fin de prueba");
    }

    public void testCreateEvent2(){
        LOG.info("Inicio de prueba");

        Participante participante = new Participante("Jhan", "Martinez", LocalDate.now(), "Colombiana", "Colombia", 24, 3);

        EventoDeportivo newEvent = new EventoDeportivo
                ("UQ Sport", "Universidad del quidnio", "Atletismo", LocalDate.now());


        new newEvent.setListParticipante();
    }

}