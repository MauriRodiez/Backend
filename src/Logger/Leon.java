package Logger;

import org.apache.log4j.Logger;

public class Leon {
    private static final Logger logger = Logger.getLogger(Leon.class);
    private String nombre;
    private int edad;
    private boolean esAlfa;

    public Leon(String nombre, int edad, boolean esAlfa){
        this.nombre = nombre;
        this. edad = edad;
        this.esAlfa = esAlfa;
    }

    public String getNombre(){
        return  nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsAlfa() {
        return esAlfa;
    }

    public void setEsAlfa(boolean esAlfa) {
        this.esAlfa = esAlfa;
    }

    public void correr(){
        logger.info("El leon " + this.getNombre() + " esta corriendo");
    }

    public void esMayorA10() throws Exception{

            if(edad < 0){
                logger.error("La edad no puede ser negativa");
                throw new Exception("");
            }

    }
}
