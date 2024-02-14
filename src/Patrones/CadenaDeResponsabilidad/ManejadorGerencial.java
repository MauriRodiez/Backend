package Patrones.CadenaDeResponsabilidad;

public class ManejadorGerencial extends Manejador{

    @Override
    public String compruebaMail(Mail mail) {
        if(mail.getAsunto().equals("gerencia") || mail.getDestino().equals("gerencia@colmena.com")){
            return "El correo llego a Gerencia";
        } else {
            return getSigueinteManejador().compruebaMail(mail);
        }
    }

}
