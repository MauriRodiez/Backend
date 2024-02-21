package Logger.Mesas;

import org.apache.log4j.Logger;

import java.util.List;

public class PromedioValores {

    List<Integer> listaValores;

    private static final Logger logger = Logger.getLogger(PromedioValores.class);

    public PromedioValores(List<Integer> listaValores) {
        this.listaValores = listaValores;
    }

    public void calcular(){

    }
}
