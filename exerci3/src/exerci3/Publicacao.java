
package exerci3;

import java.util.ArrayList;

public class Publicacao {
     private Usuario autor;
    private String conteudo;
    private ArrayList<Comentario> comentarios;

    public Publicacao(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>();
    }

    Publicacao(Usuario aThis, String conteudo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void listarComentarios() {
        System.out.println("\nComentários da publicação: \"" + conteudo + "\"");
        if (comentarios.isEmpty()) {
            System.out.println("Nenhum comentário ainda.");
        } else {
            for (Comentario c : comentarios) {
                System.out.println(c);
            }
        }
    }

    @Override
    public String toString() {
        return "\"" + conteudo + "\" (Autor: " + autor.getNome() + ")";
    }
}
