package Ex7;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    public double calcularBonus(){
        double bonus = salario * 0.10;
        System.out.println(bonus);
        return bonus;
    }
}
