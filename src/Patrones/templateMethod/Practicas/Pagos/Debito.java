package Patrones.templateMethod.Practicas.Pagos;

import java.time.LocalDate;

public class Debito extends Tarjeta{

    private double saldodisponible;

    public Debito(int numeroDelFrente, String codigoDeSeguridad, LocalDate fechaDeExpiracion, double saldodisponible) {
        super(numeroDelFrente, codigoDeSeguridad, fechaDeExpiracion);
        this.saldodisponible = saldodisponible;
    }

    public double getSaldodisponible() {
        return saldodisponible;
    }

    public void setSaldodisponible(double saldodisponible) {
        this.saldodisponible = saldodisponible;
    }

}
