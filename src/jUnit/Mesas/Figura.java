package jUnit.Mesas;

public abstract class Figura {

    private String tipo;
    private double ladoY;

    public Figura(String tipo, double ladoY) {
        this.tipo = tipo;
        this.ladoY = ladoY;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLadoY() {
        return ladoY;
    }

    public void setLadoY(double ladoY) {
        this.ladoY = ladoY;
    }

    // Metodo para calcular area
    public abstract double calcularArea(double ladoY);
}
