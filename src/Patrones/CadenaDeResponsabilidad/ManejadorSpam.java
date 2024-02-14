package Patrones.CadenaDeResponsabilidad;

public class ManejadorSpam extends Manejador{
    @Override
    public String compruebaMail(Mail mail) {
        return "El correo se envió a Spam";
    }
}
