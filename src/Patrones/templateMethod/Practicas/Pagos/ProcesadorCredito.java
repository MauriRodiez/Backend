package Patrones.templateMethod.Practicas.Pagos;

public class ProcesadorCredito extends ProcesadorPagos{

    @Override
    protected boolean procesarAutorizacion(Tarjeta tarjeta) {
        boolean authorize = false;
        tarjeta = (Credito) tarjeta
        if(((Credito) tarjeta).getLimite() < importe){

        }

        return authorize;
    }

}
