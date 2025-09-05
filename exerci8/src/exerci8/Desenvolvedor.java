
package exerci8;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {
   private String nome;
    private String id;
    private List<Tarefa> tarefas;

    public Desenvolvedor(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ")";
    }
}