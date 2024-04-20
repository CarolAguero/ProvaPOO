package exercicio;

public class Quadrado extends Retangulo {
    public Quadrado() {
        super();
    }

    public Quadrado(String cor, double lado1, double lado2) {
        super(cor, lado1, lado2);
    }

    @Override
    public String toString() {
        return "Quadrado [lado1=" + super.getLado1() + ", lado2=" + super.getLado2() + ", cor= " + cor + "]";
    }

}
