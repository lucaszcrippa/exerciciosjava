
package exerci1;

import java.util.ArrayList;


public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void listarProdutos() {
        System.out.println("\n--- Produtos em Estoque ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        }
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public Produto buscarProduto(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void listarEstoqueBaixo(int limite) {
        System.out.println("\n--- Produtos com Estoque Baixo (menor que " + limite + ") ---");
        boolean encontrou = false;
        for (Produto p : produtos) {
            if (p.getQuantidade() < limite) {
                System.out.println(p);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum produto com estoque baixo.");
        }
    }
}