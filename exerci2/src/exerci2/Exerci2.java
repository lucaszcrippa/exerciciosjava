
package exerci2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerci2 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Departamento> departamentos = new ArrayList<>();
        ArrayList<Projeto> projetos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n===== MENU FUNCIONÁRIOS =====");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Criar departamento");
            System.out.println("3. Criar projeto");
            System.out.println("4. Atribuir funcionário a departamento");
            System.out.println("5. Atribuir funcionário a projeto");
            System.out.println("6. Calcular média salarial de um departamento");
            System.out.println("7. Listar projetos de um funcionário");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do funcionário: ");
                    String nome = sc.nextLine();
                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();
                    funcionarios.add(new Funcionario(nome, salario));
                    System.out.println("Funcionário adicionado!");
                    break;

                case 2:
                    System.out.print("Nome do departamento: ");
                    String nomeDep = sc.nextLine();
                    departamentos.add(new Departamento(nomeDep));
                    System.out.println("Departamento criado!");
                    break;

                case 3:
                    System.out.print("Nome do projeto: ");
                    String nomeProj = sc.nextLine();
                    projetos.add(new Projeto(nomeProj));
                    System.out.println("Projeto criado!");
                    break;

                case 4:
                    if (funcionarios.isEmpty() || departamentos.isEmpty()) {
                        System.out.println("Cadastre funcionários e departamentos antes!");
                        break;
                    }
                    System.out.println("Escolha funcionário:");
                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(i + " - " + funcionarios.get(i).getNome());
                    }
                    int idxF = sc.nextInt();

                    System.out.println("Escolha departamento:");
                    for (int i = 0; i < departamentos.size(); i++) {
                        System.out.println(i + " - " + departamentos.get(i).getNome());
                    }
                    int idxD = sc.nextInt();

                    departamentos.get(idxD).adicionarFuncionario(funcionarios.get(idxF));
                    System.out.println("Funcionário atribuído ao departamento!");
                    break;

                case 5:
                    if (funcionarios.isEmpty() || projetos.isEmpty()) {
                        System.out.println("Cadastre funcionários e projetos antes!");
                        break;
                    }
                    System.out.println("Escolha funcionário:");
                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(i + " - " + funcionarios.get(i).getNome());
                    }
                    int idxFunc = sc.nextInt();

                    System.out.println("Escolha projeto:");
                    for (int i = 0; i < projetos.size(); i++) {
                        System.out.println(i + " - " + projetos.get(i).getNome());
                    }
                    int idxProj = sc.nextInt();

                    projetos.get(idxProj).adicionarFuncionario(funcionarios.get(idxFunc));
                    System.out.println("Funcionário atribuído ao projeto!");
                    break;

                case 6:
                    if (departamentos.isEmpty()) {
                        System.out.println("Nenhum departamento cadastrado.");
                        break;
                    }
                    System.out.println("Escolha departamento:");
                    for (int i = 0; i < departamentos.size(); i++) {
                        System.out.println(i + " - " + departamentos.get(i).getNome());
                    }
                    int idxDep = sc.nextInt();
                    double media = departamentos.get(idxDep).calcularMediaSalarial();
                    System.out.println("Média salarial do departamento: R$" + media);
                    break;

                case 7:
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                        break;
                    }
                    System.out.println("Escolha funcionário:");
                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(i + " - " + funcionarios.get(i).getNome());
                    }
                    int idxFuncionario = sc.nextInt();
                    funcionarios.get(idxFuncionario).listarProjetos();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}