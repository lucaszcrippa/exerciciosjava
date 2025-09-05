
package exerci7;

import java.time.LocalDate;
import java.util.*;

public class BibliotecaVirtual {
     private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;
    private List<Reserva> reservas;

    public BibliotecaVirtual() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestarLivro(Livro livro, Usuario usuario, LocalDate dataEmprestimo) {
        if (isDisponivel(livro)) {
            Emprestimo emp = new Emprestimo(livro, usuario, dataEmprestimo);
            emprestimos.add(emp);
            livro.incrementarEmprestimos();
            System.out.println("✅ Empréstimo realizado: " + livro.getTitulo() + " para " + usuario.getNome());
        } else {
            System.out.println("❌ Livro indisponível. Reservando...");
            reservarLivro(livro, usuario);
        }
    }

    public void devolverLivro(Livro livro, Usuario usuario, LocalDate dataDevolucao) {
        for (Emprestimo emp : emprestimos) {
            if (emp.getLivro().equals(livro) && emp.getUsuario().equals(usuario) && emp.getDataDevolucao() == null) {
                emp.devolver(dataDevolucao);
                long multa = emp.calcularMulta();
                if (multa > 0) {
                    System.out.println("⚠️ Livro devolvido com atraso. Multa: R$" + multa);
                } else {
                    System.out.println("✅ Livro devolvido no prazo.");
                }
                return;
            }
        }
        System.out.println("❌ Empréstimo não encontrado.");
    }

    public void reservarLivro(Livro livro, Usuario usuario) {
        reservas.add(new Reserva(livro, usuario));
        System.out.println("🔖 Reserva realizada: " + usuario.getNome() + " reservou " + livro.getTitulo());
    }

    public boolean isDisponivel(Livro livro) {
        for (Emprestimo emp : emprestimos) {
            if (emp.getLivro().equals(livro) && emp.getDataDevolucao() == null) {
                return false;
            }
        }
        return true;
    }

    public void listarLivrosMaisPopulares() {
        System.out.println("\n📚 Livros mais populares:");
        livros.stream()
                .sorted((a, b) -> Integer.compare(b.getTotalEmprestimos(), a.getTotalEmprestimos()))
                .limit(5)
                .forEach(livro -> System.out.println(livro + " - Empréstimos: " + livro.getTotalEmprestimos()));
    }

    public void listarReservas() {
        System.out.println("\n🔖 Reservas ativas:");
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }
}