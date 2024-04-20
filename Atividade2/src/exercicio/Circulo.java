package exercicio;

public class Circulo extends Basefigura implements IComum {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public Circulo() {
        super();
    }

    @Override
    public double getArea() {
        return raio * 3.14 * 2;
    }

    @Override
    public String toString() {
        return "Circulo [cor=" + cor + ", raio=" + raio + "]";
    }

}
