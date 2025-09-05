
package exerci7;

import java.time.LocalDate;

public class Emprestimo {
      private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void devolver(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean estaAtrasado() {
        return dataDevolucao != null && dataDevolucao.isAfter(dataEmprestimo.plusDays(7));
    }

    public long calcularMulta() {
        if (estaAtrasado()) {
            long diasAtraso = dataDevolucao.toEpochDay() - dataEmprestimo.plusDays(7).toEpochDay();
            return diasAtraso * 2; // R$2 por dia
        }
        return 0;
    }

    @Override
    public String toString() {
        return livro + " emprestado para " + usuario.getNome() + " em " + dataEmprestimo +
                (dataDevolucao == null ? " (não devolvido)" : " e devolvido em " + dataDevolucao);
    }
}
