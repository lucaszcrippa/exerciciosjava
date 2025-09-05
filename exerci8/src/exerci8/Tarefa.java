
package exerci8;

public class Tarefa {
   private String titulo;
    private int horasEstimadas;
    private Desenvolvedor responsavel;

    public Tarefa(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public Desenvolvedor getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Desenvolvedor responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        String resp = (responsavel != null) ? responsavel.getNome() : "Não atribuído";
        return titulo + " - " + horasEstimadas + "h (Responsável: " + resp + ")";
    }
}
