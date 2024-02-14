package Patrones.CadenaDeResponsabilidad;

public class Manejadorcomercial extends Manejador{
    @Override
    public String compruebaMail(Mail mail) {
        if(mail.getAsunto().equals("comercial") || mail.getDestino().equals("comercial@colmena.com")){
            return "El correo llego a Comercial";
        } else {
            return getSigueinteManejador().compruebaMail(mail);
        }
    }
}
