package FigurraGeometrica;

public class Quadrado implements FiguraGeometrica {
    public double lado;
    @Override
    public double calcularArea() {
        return 3.14 * this.lado * this.lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}