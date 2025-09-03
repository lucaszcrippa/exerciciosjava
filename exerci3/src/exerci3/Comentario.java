
package exerci3;

public class Comentario {
   private Usuario autor;
    private String conteudo;

    public Comentario(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return autor.getNome() + ": " + conteudo;
    }
}