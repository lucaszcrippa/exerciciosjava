
package exerci5;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SistemaClinica {
    private List<Medico> medicos;
    private List<Paciente> pacientes;
    private List<Consulta> consultas;

    public SistemaClinica() {
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agendarConsulta(Medico medico, Paciente paciente, LocalDateTime dataHora) {
        Consulta consulta = new Consulta(medico, paciente, dataHora);
        consultas.add(consulta);
        System.out.println("✅ Consulta agendada com sucesso!");
    }

    public void listarPacientesDoMedico(String crm) {
        System.out.println("\n=== Pacientes do médico CRM " + crm + " ===");
        List<String> pacientesUnicos = new ArrayList<>();

        for (Consulta c : consultas) {
            if (c.getMedico().getCrm().equals(crm)) {
                String nomeCpf = c.getPaciente().getNome() + " (CPF: " + c.getPaciente().getCpf() + ")";
                if (!pacientesUnicos.contains(nomeCpf)) {
                    pacientesUnicos.add(nomeCpf);
                }
            }
        }

        if (pacientesUnicos.isEmpty()) {
            System.out.println("Nenhum paciente encontrado.");
        } else {
            for (String p : pacientesUnicos) {
                System.out.println(p);
            }
        }
    }

    public void exibirProximasConsultas() {
        System.out.println("\n=== Próximas Consultas ===");
        consultas.stream()
            .sorted(Comparator.comparing(Consulta::getDataHora))
            .forEach(System.out::println);
    }
}