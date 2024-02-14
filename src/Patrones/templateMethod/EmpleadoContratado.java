package Patrones.templateMethod;

public class EmpleadoContratado extends Empleado{


    private Double horasTrabajadas;
    private Double valorPorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroDecuenta, Double horasTrabajadas, Double valorPorHora) {
        super(nombre, apellido, numeroDecuenta);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
