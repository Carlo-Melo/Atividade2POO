package Ex6;

public class Testeformas {

    public static void main(String[] args) {

        Forma circulo = new Circulo(4);
        Forma retangulo = new Retangulo(5,10);
        Forma triangulo = new Triangulo(5,10);

        ((Circulo) circulo).exibirArea();
        ((Retangulo) retangulo).exibirArea();
        ((Triangulo) triangulo).exibirArea();

    }




}
