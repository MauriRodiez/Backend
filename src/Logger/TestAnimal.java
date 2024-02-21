package Logger;


import org.apache.log4j.Logger;

public class TestAnimal {

    private static final Logger logger = Logger.getLogger(TestAnimal.class);
    public static void main(String[] args) throws Exception {

        // instancias de Leon
        Leon leon1 = new Leon("Simba",11, true);
        Leon leon2 = new Leon("Bom", -9, false);

        // instancias de Tigre
        Tigre tigre1 = new Tigre("Ramon", 11);
        Tigre tigre2 = new Tigre("Pepe", 5);

        // Testear metodos
        leon1.correr();
        leon2.correr();
        try {
            leon2.esMayorA10();
        } catch (Exception e){
            logger.error("La edad del leon " + leon2.getNombre() + " es incorrecta", e);
        }


        tigre1.correr();
        tigre2.correr();
    }


}
