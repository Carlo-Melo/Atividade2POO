package Ex6;

public class Retangulo implements Forma {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public void exibirArea() {
        System.out.println("Area do Retangulo: " + calcularArea());
    }
}
