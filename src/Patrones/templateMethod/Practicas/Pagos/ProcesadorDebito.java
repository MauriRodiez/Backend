package Patrones.templateMethod.Practicas.Pagos;

public class ProcesadorDebito extends ProcesadorPagos{

    @Override
    protected boolean procesarAutorizacion(Tarjeta tarjeta) {
        return false;
    }
}
