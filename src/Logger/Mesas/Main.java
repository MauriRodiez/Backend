package Logger.Mesas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        PromedioValores listado = new PromedioValores(lista);

        lista.add(20);
        lista.add(200);
        lista.add(10);
        lista.add(8);
        lista.add(25);
        lista.add(231);
        lista.add(12);
        lista.add(2);

        listado.calcular();


    }

}
