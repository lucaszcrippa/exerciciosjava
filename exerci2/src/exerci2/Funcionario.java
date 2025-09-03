
package exerci2;

import java.util.ArrayList;

public class Funcionario {
  private String nome;
    private double salario;
    private Departamento departamento;
    private ArrayList<Projeto> projetos;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void adicionarProjeto(Projeto projeto) {
        if (!projetos.contains(projeto)) {
            projetos.add(projeto);
        }
    }

    public void listarProjetos() {
        System.out.println("\nProjetos de " + nome + ":");
        if (projetos.isEmpty()) {
            System.out.println("Nenhum projeto atribuído.");
        } else {
            for (Projeto p : projetos) {
                System.out.println("- " + p.getNome());
            }
        }
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " | Salário: R$" + salario + 
               (departamento != null ? " | Departamento: " + departamento.getNome() : "");
    }
}