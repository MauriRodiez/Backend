package Patrones.templateMethod.Practicas.Pagos;

import java.time.LocalDate;
import java.util.Date;

public abstract class Tarjeta {

    private int numeroDelFrente;
    private String codigoDeSeguridad;
    private LocalDate fechaDeExpiracion;

    public Tarjeta(int numeroDelFrente, String codigoDeSeguridad, LocalDate fechaDeExpiracion) {
        this.numeroDelFrente = numeroDelFrente;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.fechaDeExpiracion = fechaDeExpiracion;
    }

    public int getNumeroDelFrente() {
        return numeroDelFrente;
    }

    public void setNumeroDelFrente(int numeroDelFrente) {
        this.numeroDelFrente = numeroDelFrente;
    }

    public String getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public void setCodigoDeSeguridad(String codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }

    public LocalDate getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }

    public void setFechaDeExpiracion(LocalDate fechaDeExpiracion) {
        this.fechaDeExpiracion = fechaDeExpiracion;
    }
}
