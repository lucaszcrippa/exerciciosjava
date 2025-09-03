
package exerci2;

import java.util.ArrayList;

public class Projeto {
     private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Projeto(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (!funcionarios.contains(f)) {
            funcionarios.add(f);
            f.adicionarProjeto(this);
        }
    }

    public void listarFuncionarios() {
        System.out.println("\nFuncionários no projeto " + nome + ":");
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário neste projeto.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f.getNome());
            }
        }
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}