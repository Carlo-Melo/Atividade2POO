package Ex5;

public class PagamentoCartao extends Pagamento{

    @Override
    public double calcularValor(double valor) {
        return valor + (valor * 0.02);
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
    }

}
