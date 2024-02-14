package Patrones.CadenaDeResponsabilidad;

public abstract class Manejador {

    private Manejador sigueinteManejador;

    public Manejador getSigueinteManejador() {
        return sigueinteManejador;
    }

    public void setSigueinteManejador(Manejador sigueinteManejador) {
        this.sigueinteManejador = sigueinteManejador;
    }

    public abstract String compruebaMail(Mail mail);

}
