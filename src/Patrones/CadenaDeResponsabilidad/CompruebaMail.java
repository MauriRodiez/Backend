package Patrones.CadenaDeResponsabilidad;

public class CompruebaMail {

    private Manejador manejador;

    public String checkMail(Mail mail){
        return manejador.compruebaMail(mail);
    }

    public CompruebaMail(){
        // Punto inicial
        manejador = new ManejadorGerencial();

        // Armo la cadena
        Manejador comercial = new Manejadorcomercial();
        Manejador tecnica = new ManejadorTecnica();
        Manejador spam = new ManejadorSpam();

        // Uno la cadena

        // todo: (sirve para comentar con otro color una tarea que dejo para despues)

        manejador.setSigueinteManejador(comercial);
        comercial.setSigueinteManejador(tecnica);
        tecnica.setSigueinteManejador(spam);
    }
}
