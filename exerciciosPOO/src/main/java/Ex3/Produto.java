package Ex3;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Produto {

    private String nome;
    private double preco;
    private  int quantidadeEstoque;

    public Produto(int quantidadeEstoque, String nome, double preco) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: "+ getPreco());
        System.out.println("Quantidade em Estoque: "+ getQuantidadeEstoque());
    }

    public int adicionarEstoque(int unidade){
        quantidadeEstoque = quantidadeEstoque + unidade;
        return quantidadeEstoque;
    }

    public void removerEstoque(int unidade){
        if(quantidadeEstoque - unidade < 0){
            System.out.println("Não foi possivel remover essa quantidade");
            return;
        }
        else{
            quantidadeEstoque = quantidadeEstoque - unidade;
            System.out.println(quantidadeEstoque);
            return;
        }
    }
}
