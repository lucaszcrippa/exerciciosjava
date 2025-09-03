
package exerci1;

import java.util.Scanner;

public class Exerci1 {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();
        Fornecedor f1 = new Fornecedor("Fornecedor A", "contatoA@email.com");
        Fornecedor f2 = new Fornecedor("Fornecedor B", "contatoB@email.com");

        int opcao;
        do {
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Listar produtos com estoque baixo");
            System.out.println("4. Fazer pedido a fornecedor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int qtd = sc.nextInt();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    estoque.adicionarProduto(new Produto(nome, qtd, preco));
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    estoque.listarProdutos();
                    break;

                case 3:
                    System.out.print("Informe o limite mínimo: ");
                    int limite = sc.nextInt();
                    estoque.listarEstoqueBaixo(limite);
                    break;

                case 4:
                    System.out.print("Nome do produto para pedir: ");
                    String nomePedido = sc.nextLine();
                    Produto p = estoque.buscarProduto(nomePedido);
                    if (p == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }
                    System.out.print("Quantidade para pedir: ");
                    int qtdPedido = sc.nextInt();

                    System.out.println("Escolha fornecedor: 1 - " + f1.getNome() + ", 2 - " + f2.getNome());
                    int escolha = sc.nextInt();
                    Fornecedor fornecedor = (escolha == 1) ? f1 : f2;

                    Pedido pedido = new Pedido(p, fornecedor, qtdPedido);
                    pedido.realizarPedido();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}