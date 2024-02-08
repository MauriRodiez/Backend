package jUnit.Practicas;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void casoUno(){

        Persona personaUno = new Persona("Felipe", "Sanguinetti","prueba@prueba.com", LocalDate.of(1981,11,21));

        assertTrue(personaUno.nombreCompleto());


    }

}