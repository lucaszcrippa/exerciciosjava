
package exerci3;

import java.util.ArrayList;

public class Usuario {
      private String nome;
    private ArrayList<Publicacao> publicacoes;

    public Usuario(String nome) {
        this.nome = nome;
        this.publicacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void criarPublicacao(String conteudo) {
        Publicacao pub = new Publicacao(this, conteudo);
        publicacoes.add(pub);
        System.out.println("Publicação criada com sucesso!");
    }

    public void listarPublicacoes() {
        System.out.println("\nPublicações de " + nome + ":");
        if (publicacoes.isEmpty()) {
            System.out.println("Nenhuma publicação encontrada.");
        } else {
            for (int i = 0; i < publicacoes.size(); i++) {
                System.out.println(i + " - " + publicacoes.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Usuário: " + nome;
    }
}
