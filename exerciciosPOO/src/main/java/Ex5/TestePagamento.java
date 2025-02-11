package Ex5;

public class TestePagamento {

    public static void main(String[] args) {

        Pagamento boleto = new PagamentoBoleto();
        Pagamento cartao = new PagamentoCartao();

        double valor = 100;

        boleto.calcularValor(valor);
        cartao.calcularValor(valor);


    }
}
