package Patrones.templateMethod;

public class LiquidadorEmpleadoefectivo extends Liquidador{

    @Override
    protected Double calcularSueldo(Empleado empleado) {
        Double respuesta = 0.0;

        if(empleado instanceof EmpleadoEfectivo) {
            EmpleadoEfectivo contratado = (EmpleadoEfectivo) empleado;
            respuesta = contratado.getSueldoBasico() + contratado.getPremios() - contratado.getDescuentos();
        }

        return respuesta;
    }

    @Override
    protected String emitirRecibo(Empleado empleado) {
        return " un documento impreso";
    }
}
