
package exerci8;

public class Exerci8 {

    public static void main(String[] args) {
        SistemaProjetos sistema = new SistemaProjetos();

        // Criando projetos
        Projeto projeto1 = new Projeto("Sistema de Vendas");
        Projeto projeto2 = new Projeto("App Mobile");

        sistema.adicionarProjeto(projeto1);
        sistema.adicionarProjeto(projeto2);

        // Criando desenvolvedores
        Desenvolvedor dev1 = new Desenvolvedor("Alice", "DEV001");
        Desenvolvedor dev2 = new Desenvolvedor("Bruno", "DEV002");

        sistema.adicionarDesenvolvedor(dev1);
        sistema.adicionarDesenvolvedor(dev2);

        // Criando tarefas
        Tarefa t1 = new Tarefa("Implementar login", 8);
        Tarefa t2 = new Tarefa("Criar banco de dados", 10);
        Tarefa t3 = new Tarefa("Tela inicial", 5);
        Tarefa t4 = new Tarefa("API de produtos", 12);

        projeto1.adicionarTarefa(t1);
        projeto1.adicionarTarefa(t2);
        projeto2.adicionarTarefa(t3);
        projeto2.adicionarTarefa(t4);

        // Atribuindo tarefas
        sistema.atribuirTarefa(t1, dev1);
        sistema.atribuirTarefa(t2, dev2);
        sistema.atribuirTarefa(t3, dev1);
        sistema.atribuirTarefa(t4, dev2);

        // Exibindo carga de trabalho por projeto
        sistema.mostrarCargaProjeto("Sistema de Vendas");
        sistema.mostrarCargaProjeto("App Mobile");

        // Listando tarefas por desenvolvedor
        sistema.listarTarefasDoDesenvolvedor("DEV001");
        sistema.listarTarefasDoDesenvolvedor("DEV002");
    }
}

