
package exerci2;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (!funcionarios.contains(f)) {
            funcionarios.add(f);
            f.setDepartamento(this);
        }
    }

    public double calcularMediaSalarial() {
        if (funcionarios.isEmpty()) return 0.0;
        double soma = 0;
        for (Funcionario f : funcionarios) {
            soma += f.getSalario();
        }
        return soma / funcionarios.size();
    }

    public void listarFuncionarios() {
        System.out.println("\nFuncionários do departamento " + nome + ":");
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário neste departamento.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
