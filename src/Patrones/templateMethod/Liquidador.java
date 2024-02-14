package Patrones.templateMethod;

public abstract class Liquidador {

    public String liquidarSueldo(Empleado empleado){
        String respuesta = "La liquidación no pudo ser calculada";

        // 1 Calcular sueldo
        // 2 imprimir recibo
        // 3 depositarlo

        Double sueldo = calcularSueldo(empleado);

        if(sueldo > 0){
            String recibo = emitirRecibo(empleado);
            respuesta = "La liquidacion generada es " + sueldo + " y " + recibo;
        }

        String deposito = depositarSueldo(empleado);

        return respuesta;
    }

    // 1 Calcular sueldo
    protected abstract Double calcularSueldo(Empleado empleado);

    // 2 imprimir recibo
    protected abstract String emitirRecibo(Empleado empleado);

    // 3 depositarlo
    private String depositarSueldo(Empleado empleado){
        return "Se deposito en la cuenta " + empleado.getNumeroDecuenta();
    }
}
