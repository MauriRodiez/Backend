package jUnit.Practicas;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    /* 3- Un test que nos certifique que el nombre completo es correcto. */

    @Test
    public void casoUno(){

        Persona personaUno = new Persona("Felipe", "Sanguinetti","prueba@prueba.com", LocalDate.of(1981,11,21));

        assertTrue(personaUno.nombreCorrecto());

    }

    /* 4- Un test que nos certifique que la persona es realmente mayor a 18 años, tener en cuenta que la fecha
de hoy que vamos a utilizar en los test tiene que ir harcodeada, es decir, agregada manualmente con la
fecha: 21/09/2021. Debemos comparar contra esta fecha en los tests. Por ejemplo, alguien nacido el
20/01/2015 no es mayor a 18 años.  */

    @Test
    public void casoDos(){

        Persona personaDos = new Persona("Felipe", "Sanguinetti","prueba@prueba.com", LocalDate.of(1981,11,21));

        assertTrue(personaDos.esMayor());
    }

}