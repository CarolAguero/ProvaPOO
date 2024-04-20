import exercicio.Retangulo;
import exercicio.Quadrado;
import exercicio.Triangulo;
import exercicio.Circulo;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado();
        quadrado.setCor("Roxo");
        quadrado.setLado1(4);

        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);

        System.out.println(quadrado);
        System.out.println("Base do Quadrado: " + quadrado.getArea() + "\n");
        System.out.println(triangulo);
        System.out.println("Base do Triangulo: " + triangulo.getArea() + "\n");
        System.out.println(circulo);
        System.out.println("Base do Circulo: " + circulo.getArea() + "\n");
        System.out.println(retangulo);
        System.out.println("Base do Retangulo: " + retangulo.getArea() + "\n");
    }
}
