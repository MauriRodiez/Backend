package Patrones.templateMethod;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LiquidadorEmpleadoefectivoTest {

    @Test
    public void testLiquidacionempleado(){

        Empleado empleado = new EmpleadoEfectivo("Martin", "Martini", "123456", 400.0, 40.0, 60.0);

        Liquidador liquidador = new LiquidadorEmpleadoefectivo();
        String respuesta = "La liquidación generada es: un documento impreso. Saldo a liquidar: 420.0";

        String liquidacion = liquidador.liquidarSueldo(empleado);

        assertEquals(respuesta, liquidacion);

    }

}