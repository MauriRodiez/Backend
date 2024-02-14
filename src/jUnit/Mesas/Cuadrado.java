package jUnit.Mesas;

public class Cuadrado extends Figura{

    public Cuadrado(String tipo, double ladoY) {
        super(tipo, ladoY);
    }

    @Override
    public double calcularArea(double ladoY) {
        double area = 0;

        if(ladoY < 0){
            System.out.println("El valor del lado debe ser mayor que cero");
        } else {
            area = ladoY * ladoY;
            System.out.println("El área del " + getTipo() + " " + area);
        }
        return area;
    }


}
