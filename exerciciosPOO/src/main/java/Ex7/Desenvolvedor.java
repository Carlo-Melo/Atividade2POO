package Ex7;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    @Override
    public double calcularBonus(){
        double bonus = salario * 0.15;
        System.out.println(bonus);
        return bonus;
    }
}
