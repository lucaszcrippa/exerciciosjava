
package exerci10;

public class Matricula {
        private Estudante estudante;
    private Disciplina disciplina;
    private double nota;

    public Matricula(Estudante estudante, Disciplina disciplina, double nota) {
        this.estudante = estudante;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return estudante.getNome() + " - Nota: " + nota;
    }
}