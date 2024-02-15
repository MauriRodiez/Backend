package Patrones.templateMethod.Practicas.Pagos;

import java.time.LocalDate;

public class Credito extends Tarjeta{

    private double limite;
    private double saldoUtilizado;

    public Credito(int numeroDelFrente, String codigoDeSeguridad, LocalDate fechaDeExpiracion, double limite, double saldoUtilizado) {
        super(numeroDelFrente, codigoDeSeguridad, fechaDeExpiracion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }
}
