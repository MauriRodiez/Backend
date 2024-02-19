package Logger;

import org.apache.log4j.Logger;


public class Tigre {
    private static final Logger logger = Logger.getLogger(Tigre.class);
    private String nombre;
    private int edad;

    public Tigre(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void correr(){
        logger.info("El tigre" + this.getNombre() + " esta corriendo");
    }

    public void esMayorA10(){
        if(edad > 10){
            logger.info("El tigre" + this.getNombre() + " tiene mas de 10 años");
        }
    }
}
