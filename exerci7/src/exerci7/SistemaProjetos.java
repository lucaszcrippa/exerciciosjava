
package exerci7;

import java.util.ArrayList;
import java.util.List;

public class SistemaProjetos {
       private List<Projeto> projetos;
    private List<Desenvolvedor> desenvolvedores;

    public SistemaProjetos() {
        projetos = new ArrayList<>();
        desenvolvedores = new ArrayList<>();
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public void adicionarDesenvolvedor(Desenvolvedor dev) {
        desenvolvedores.add(dev);
    }

    public void atribuirTarefa(Tarefa tarefa, Desenvolvedor dev) {
        tarefa.setResponsavel(dev);
        dev.adicionarTarefa(tarefa);
        System.out.println("✅ Tarefa atribuída: " + tarefa.getTitulo() + " -> " + dev.getNome());
    }

    public void listarTarefasDoDesenvolvedor(String id) {
        System.out.println("\n📋 Tarefas do desenvolvedor ID " + id + ":");
        for (Desenvolvedor dev : desenvolvedores) {
            if (dev.getId().equals(id)) {
                for (Tarefa t : dev.getTarefas()) {
                    System.out.println("- " + t);
                }
                return;
            }
        }
        System.out.println("❌ Desenvolvedor não encontrado.");
    }

    public void mostrarCargaProjeto(String nomeProjeto) {
        for (Projeto p : projetos) {
            if (p.getNome().equalsIgnoreCase(nomeProjeto)) {
                int carga = p.calcularCargaTrabalho();
                System.out.println("\n🧮 Carga total de trabalho do projeto \"" + nomeProjeto + "\": " + carga + " horas");
                return;
            }
        }
        System.out.println("❌ Projeto não encontrado.");
    }
}
