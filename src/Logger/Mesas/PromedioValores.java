package Logger.Mesas;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PromedioValores {

    private List<Integer> listaEnteros;

    private static final Logger logger = Logger.getLogger(PromedioValores.class);

    public PromedioValores(List<Integer> lista) {
        this.listaEnteros = lista;
    }

    public void calcular(){

        Integer minimo = 0;
        Integer maximo = 0;
        Integer suma = 0;
        double promedio = 0.0;

        if(listaEnteros.size() > 0){

            for(Integer valor : listaEnteros){
                // Asigno el valor del primer valor a la lista en minimo y maximo
                minimo = listaEnteros.get(0);
                maximo = listaEnteros.get(0);

                // Evaluo si el minimo es mayor que el valor iterado para colocarlo en minimo
                if(minimo > valor){
                    minimo = valor;
                }

                // Evaluo si el maximo es menor que el valor iterado para colocarlo en minimo
                if(maximo < valor){
                    maximo = valor;
                }

                suma += valor;
            }

            //Suma de toda la lista
            System.out.println("La suma de todos los valores de la lista es: " + suma);

            // El minimo
            System.out.println("El valor mínimo en la lista es: " + minimo);

            // El maximo
            System.out.println("El valor máximo en la lista es: " + maximo);

            // Calcular promedio
            promedio = suma / listaEnteros.size();
            System.out.println("El valor promedio de la lista es: " + promedio);

            // Cuando la lista tiene mas de 5 elementos
            if(listaEnteros.size() > 5){
                logger.info("La longitud de la lista es mayor a 5");
            }

            // cuando la lista es mayor a 10 elementos
            if(listaEnteros.size() > 10){
                logger.info("La longitud de la lista es mayor a 10");
            }

        } else {
            logger.error("La lista es igual a cero");
        }

    }
}
