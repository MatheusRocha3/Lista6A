package FigurraGeometrica;

public class Retangulo implements FiguraGeometrica {

    double base;
    double altura;


    @Override

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}