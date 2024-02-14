package jUnit.Mesas;

public class Circulo extends Figura{

    public Circulo(String tipo, double ladoY) {
        super(tipo, ladoY);
    }

    @Override
    public double calcularArea(double ladoY) {
        double pi = 3.1416;
        double area = 0;

        if(ladoY < 0){
            System.out.println("El valor del lado debe ser mayor que cero");
        } else {
            area = pi * ladoY * ladoY;
            System.out.println("El área del " + getTipo() + " " + area);
        }
        return area;
    }
}
