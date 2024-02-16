package Patrones.templateMethod.Practicas.Pagos;

public class ProcesadorCredito extends ProcesadorPagos{

    @Override
    protected String procesarPago(Tarjeta tarjeta, double importe) {
        String mensaje = "";
        boolean autorizacion = false;
        boolean fechaValida = validarfecha(tarjeta);

        if(importe < ((Credito) tarjeta).getLimite()){
            autorizacion = true;
        }

        if(tarjeta instanceof Credito && fechaValida && autorizacion){
            if(importe < ((Credito) tarjeta).getLimite()){
                mensaje = "El pago es procesado con la tarjeta Nº " + tarjeta.getNumeroDelFrente() + " y un valor de " + importe + " pesos";
            } else {
                mensaje = "No es posible procesar el pago, se excede el limite de la tarjeta";
            }
        }
        return mensaje;
    }

}
