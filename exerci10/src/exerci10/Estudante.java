
package exerci10;

public class Estudante {
     private String nome;
    private String matricula;

    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return nome + " (Matrícula: " + matricula + ")";
    }
}