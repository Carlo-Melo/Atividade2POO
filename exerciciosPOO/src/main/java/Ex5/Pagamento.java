package Ex5;

public abstract class Pagamento {

    public abstract double calcularValor(double valor);

    public void exibirDetalhes(){
        System.out.println("Pagameto Efetuado com Sucesso");
    }
}
