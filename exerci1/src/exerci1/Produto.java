
package exerci1;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }

    @Override
    public String toString() {
        return nome + " | Quantidade: " + quantidade + " | Preço: R$" + preco;
    }
}