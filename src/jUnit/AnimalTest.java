package jUnit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    public void siElAnimalEsPesado(){
        Animal caballo = new Animal("caballo", "grande", 2500);
        Animal perro = new Animal("perro", "mediano", 20);

        boolean esPesado = caballo.esPesado();
        boolean esPesado1 = perro.esPesado();

        assertEquals(true, caballo.esPesado());
        assertFalse(esPesado1);
    }

}