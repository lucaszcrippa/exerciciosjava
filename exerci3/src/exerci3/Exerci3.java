
package exerci3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerci3 {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n===== MENU MÍDIA SOCIAL =====");
            System.out.println("1. Criar usuário");
            System.out.println("2. Criar publicação");
            System.out.println("3. Comentar em publicação");
            System.out.println("4. Listar publicações de um usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do usuário: ");
                    String nome = sc.nextLine();
                    usuarios.add(new Usuario(nome));
                    System.out.println("Usuário criado!");
                    break;

                case 2:
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                        break;
                    }
                    System.out.println("Escolha usuário:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " - " + usuarios.get(i).getNome());
                    }
                    int idxU = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o conteúdo da publicação: ");
                    String conteudo = sc.nextLine();
                    usuarios.get(idxU).criarPublicacao(conteudo);
                    break;

                case 3:
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                        break;
                    }
                    System.out.println("Escolha usuário que vai comentar:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " - " + usuarios.get(i).getNome());
                    }
                    int idxAutor = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Escolha usuário dono da publicação:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " - " + usuarios.get(i).getNome());
                    }
                    int idxDono = sc.nextInt();
                    sc.nextLine();

                    Usuario dono = usuarios.get(idxDono);
                    dono.listarPublicacoes();

                    if (dono.getPublicacoes().isEmpty()) break;

                    System.out.print("Escolha o índice da publicação: ");
                    int idxPub = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o comentário: ");
                    String comentarioTxt = sc.nextLine();

                    Comentario comentario = new Comentario(usuarios.get(idxAutor), comentarioTxt);
                    dono.getPublicacoes().get(idxPub).adicionarComentario(comentario);

                    System.out.println("Comentário adicionado!");
                    break;

                case 4:
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                        break;
                    }
                    System.out.println("Escolha usuário:");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " - " + usuarios.get(i).getNome());
                    }
                    int idxListar = sc.nextInt();
                    sc.nextLine();

                    usuarios.get(idxListar).listarPublicacoes();

                    if (!usuarios.get(idxListar).getPublicacoes().isEmpty()) {
                        System.out.print("Deseja ver comentários de alguma publicação? (s/n): ");
                        String resp = sc.nextLine();
                        if (resp.equalsIgnoreCase("s")) {
                            System.out.print("Digite o índice da publicação: ");
                            int idxVer = sc.nextInt();
                            sc.nextLine();
                            usuarios.get(idxListar).getPublicacoes().get(idxVer).listarComentarios();
                        }
                    }
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