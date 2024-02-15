package Patrones.templateMethod.Practicas.Pagos;

import java.time.LocalDate;

public abstract class ProcesadorPagos {

    public String procesarPago(Tarjeta tarjeta, double importe){

        String mensaje = "";

        if(tarjeta instanceof Credito){
            procesarAutorizacion(tarjeta);
            validarfecha(tarjeta);
            mensaje = "Se realizo el pago correctamente con la tarjeta " + tarjeta.getNumeroDelFrente() + " por un monto de " + importe;
        } else if (tarjeta instanceof Debito) {
            procesarAutorizacion(tarjeta);
            validarfecha(tarjeta);
            mensaje = "Se realizo el pago correctamente con la tarjeta " + tarjeta.getNumeroDelFrente() + " por un monto de " + importe;
        } else {
            mensaje = "No es posible realizar la autorización del pago";
        }

        return mensaje;
    }

    public boolean validarfecha(Tarjeta tarjeta){

        boolean fechaValidada = false;
        LocalDate fechaActual = LocalDate.now();

        if(tarjeta.getFechaDeExpiracion().isAfter(fechaActual)){
            fechaValidada = false;
            System.out.println("La fecha de expiracion no puede ser inferior a la fecha actual");
        } else {
            fechaValidada = true;
            System.out.println("La fecha es correcta");
        }
        return fechaValidada;
    }
    protected abstract boolean procesarAutorizacion(Tarjeta tarjeta);

}
