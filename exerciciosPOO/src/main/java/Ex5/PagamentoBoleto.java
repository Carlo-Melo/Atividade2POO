package Ex5;

public class PagamentoBoleto extends Pagamento{

    @Override
    public double calcularValor(double valor) {
        return valor;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
