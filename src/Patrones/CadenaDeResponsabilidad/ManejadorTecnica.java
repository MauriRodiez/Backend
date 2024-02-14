package Patrones.CadenaDeResponsabilidad;

public class ManejadorTecnica extends Manejador{
    @Override
    public String compruebaMail(Mail mail) {
        if(mail.getAsunto().equals("tecnico") || mail.getDestino().equals("tecnica@colmena.com")){
            return "El correo llego a Tecnico";
        } else {
            return getSigueinteManejador().compruebaMail(mail);
        }
    }
}
