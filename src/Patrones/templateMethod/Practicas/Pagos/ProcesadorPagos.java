package Patrones.templateMethod.Practicas.Pagos;

import java.time.LocalDate;

public abstract class ProcesadorPagos {

    protected abstract String procesarPago(Tarjeta tarjeta, double importe);

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

}