package Ex6;

public class Circulo implements Forma {

    public Circulo(double raio) {
        this.raio = raio;
    }

    private double raio;

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public void exibirArea(){
        System.out.println("Area do Circulo: " + calcularArea());
    }


}
