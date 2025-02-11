package Ex7;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Carlos", 3000);
        Funcionario gerente = new Gerente("Gerente",10000);
        Funcionario desenvolvedor = new Desenvolvedor("Desenvolvedor", 15000);

        funcionario.exibirDetalhes();
        funcionario.calcularBonus();
        gerente.exibirDetalhes();
        gerente.calcularBonus();
        desenvolvedor.exibirDetalhes();
        desenvolvedor.calcularBonus();


    }
}
