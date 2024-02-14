package jUnit.Mesas;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FiguraTest {

    @Test
    public void casoUno(){
        //Dado
        Figura cuadrado = new Cuadrado("cuadrado", 10);
        Figura circulo = new Circulo("circulo", 2.5);

        //Accion
        double areaCuadrado =  cuadrado.calcularArea(cuadrado.getLadoY());
        double areaCirculo = circulo.calcularArea(circulo.getLadoY());

        //Check
        assertTrue(areaCuadrado > 0 );
        assertTrue(areaCirculo > 0);


    }


}