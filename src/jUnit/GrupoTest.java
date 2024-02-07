package jUnit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GrupoTest {

    @Test
    public void casoUno(){
        //Dado lo que necesito para la prueba
        Persona juan = new Persona("Juan", 20);
        Persona pedro = new Persona("Pedro", 20);
        Persona ana = new Persona("Ana", 20);
        Persona luz = new Persona("Luz", 20);
        Persona julian = new Persona("Julian", 20);
        Grupo grupo1 = new Grupo();

        //Cuando
        grupo1.agregarPersona(juan);
        grupo1.agregarPersona(pedro);
        grupo1.agregarPersona(ana);
        grupo1.agregarPersona(luz);
        grupo1.agregarPersona(julian);

    }

}