
package exerci7;

public class Livro {
  private String titulo;
    private Autor autor;
    private int totalEmprestimos;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalEmprestimos = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getTotalEmprestimos() {
        return totalEmprestimos;
    }

    public void incrementarEmprestimos() {
        totalEmprestimos++;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" por " + autor.getNome();
    }
}