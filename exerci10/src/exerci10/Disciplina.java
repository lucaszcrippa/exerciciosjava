
package exerci10;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
 private String nome;
    private Professor professor;
    private List<Matricula> matriculas;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.matriculas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }

    public double calcularMedia() {
        if (matriculas.isEmpty()) return 0;
        double soma = 0;
        for (Matricula m : matriculas) {
            soma += m.getNota();
        }
        return soma / matriculas.size();
    }

    @Override
    public String toString() {
        return nome + " - Professor: " + professor.getNome();
    }
}