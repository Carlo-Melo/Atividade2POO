package Ex7;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    @Override
    public double calcularBonus(){
        double bonus = salario * 0.20;
        System.out.println(bonus);
        return bonus;
    }

}
