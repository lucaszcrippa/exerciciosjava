
package exerci10;

public class Exerci10 {

    public static void main(String[] args) {
       Universidade universidade = new Universidade();

        // Criando professores
        Professor prof1 = new Professor("Carlos Silva", "P001");
        Professor prof2 = new Professor("Maria Oliveira", "P002");

        universidade.adicionarProfessor(prof1);
        universidade.adicionarProfessor(prof2);

        // Criando disciplinas
        Disciplina d1 = new Disciplina("Algoritmos", prof1);
        Disciplina d2 = new Disciplina("Banco de Dados", prof2);

        universidade.adicionarDisciplina(d1);
        universidade.adicionarDisciplina(d2);

        // Criando estudantes
        Estudante e1 = new Estudante("Ana Paula", "E1001");
        Estudante e2 = new Estudante("João Pedro", "E1002");
        Estudante e3 = new Estudante("Luciana Costa", "E1003");

        universidade.adicionarEstudante(e1);
        universidade.adicionarEstudante(e2);
        universidade.adicionarEstudante(e3);

        // Matriculando estudantes
        universidade.matricularEstudante(e1, d1, 8.5);
        universidade.matricularEstudante(e2, d1, 7.0);
        universidade.matricularEstudante(e3, d1, 9.0);

        universidade.matricularEstudante(e1, d2, 6.5);
        universidade.matricularEstudante(e2, d2, 7.5);

        // Calculando médias
        universidade.calcularMediaDisciplina("Algoritmos");
        universidade.calcularMediaDisciplina("Banco de Dados");

        // Listando disciplinas por professor
        universidade.listarDisciplinasDoProfessor("P001");
        universidade.listarDisciplinasDoProfessor("P002");
    }
}