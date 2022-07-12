package FigurraGeometrica;

    public class Calcular {

        public static void main(String[] args) {
            Quadrado quadrado = new Quadrado();

            quadrado.setLado(7);
            double areaQuadrado = quadrado.calcularArea();
            System.out.println("Lado do quadrado é: " + quadrado.getLado());
            System.out.println("A area do quadrado é: " + areaQuadrado);

            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(7);
            retangulo.setBase(3);
            double areaRetangulo = retangulo.calcularArea();
            System.out.println("A base do retangulo é: " + retangulo.getBase());
            System.out.println("A altura é de: " + retangulo.getAltura());
            System.out.println("A area do retangulo é de: " + areaRetangulo);

            Triangulo triangulo = new Triangulo();
            triangulo.setAltura(7);
            triangulo.setBase(3);
            double areaTriangulo = triangulo.calcularArea();
            System.out.println("A base do triangulo é " + triangulo.getBase());
            System.out.println("A altura do triangulo é " + triangulo.getAltura());
            System.out.println("A area do triangulo é " + areaTriangulo);

            Circulo circulo = new Circulo();
            circulo.setRaio(3);
            double areaCirculo = circulo.calcularArea();
            System.out.println("O raio do Circulo é de " + circulo.getRaio());
            System.out.println("A area do circulo é de " + areaCirculo);
        }
    }


