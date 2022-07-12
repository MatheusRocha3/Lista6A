package FigurraGeometrica;

public class Circulo implements FiguraGeometrica{

    double raio;

    @Override
    public double calcularArea() {

        return  (raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}