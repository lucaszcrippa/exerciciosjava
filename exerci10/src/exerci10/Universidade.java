
package exerci10;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
   private List<Estudante> estudantes;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    public Universidade() {
        estudantes = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void matricularEstudante(Estudante estudante, Disciplina disciplina, double nota) {
        Matricula matricula = new Matricula(estudante, disciplina, nota);
        disciplina.adicionarMatricula(matricula);
        System.out.println("✅ " + estudante.getNome() + " matriculado(a) em " + disciplina.getNome() + " com nota " + nota);
    }

    public void calcularMediaDisciplina(String nomeDisciplina) {
        for (Disciplina d : disciplinas) {
            if (d.getNome().equalsIgnoreCase(nomeDisciplina)) {
                double media = d.calcularMedia();
                System.out.printf("📊 Média da disciplina \"%s\": %.2f%n", nomeDisciplina, media);
                return;
            }
        }
        System.out.println("❌ Disciplina não encontrada.");
    }

    public void listarDisciplinasDoProfessor(String idProfessor) {
        System.out.println("\n📚 Disciplinas do Professor (ID: " + idProfessor + "):");
        for (Disciplina d : disciplinas) {
            if (d.getProfessor().getId().equals(idProfessor)) {
                System.out.println("- " + d.getNome());
            }
        }
    }
}