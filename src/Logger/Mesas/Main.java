package Logger.Mesas;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Esto es el comienzo de la clase");
        logger.warn("Se esta terminando la clase, vamos a las mesas");
    }

}
