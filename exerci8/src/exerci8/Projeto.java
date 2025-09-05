
package exerci8;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
       private String nome;
    private List<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public int calcularCargaTrabalho() {
        int totalHoras = 0;
        for (Tarefa tarefa : tarefas) {
            totalHoras += tarefa.getHorasEstimadas();
        }
        return totalHoras;
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + " | Total de tarefas: " + tarefas.size();
    }
}
