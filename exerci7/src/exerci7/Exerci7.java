
package exerci7;

import java.time.LocalDate;

public class Exerci7 {

    public static void main(String[] args) {
        BibliotecaVirtual biblioteca = new BibliotecaVirtual();

        // Autores
        Autor a1 = new Autor("Machado de Assis");
        Autor a2 = new Autor("J.K. Rowling");

        // Livros
        Livro l1 = new Livro("Dom Casmurro", a1);
        Livro l2 = new Livro("Harry Potter", a2);
        Livro l3 = new Livro("Memórias Póstumas", a1);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        // Usuários
        Usuario u1 = new Usuario("Ana", "U001");
        Usuario u2 = new Usuario("Carlos", "U002");

        biblioteca.adicionarUsuario(u1);
        biblioteca.adicionarUsuario(u2);

        // Empréstimos
        biblioteca.emprestarLivro(l1, u1, LocalDate.of(2025, 9, 1));
        biblioteca.emprestarLivro(l2, u2, LocalDate.of(2025, 9, 1));
        biblioteca.emprestarLivro(l2, u1, LocalDate.of(2025, 9, 2)); // Deve entrar em reserva

        // Devolução em atraso
        biblioteca.devolverLivro(l1, u1, LocalDate.of(2025, 9, 15)); // 7 dias de atraso

        // Devolução no prazo