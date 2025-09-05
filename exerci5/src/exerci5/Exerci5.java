
package exerci5;

import java.time.LocalDateTime;


public class Exerci5 {
    public static void main(String[] args) {
        SistemaClinica sistema = new SistemaClinica();

        // Criando médicos
        Medico m1 = new Medico("Dra. Ana Costa", "CRM1234");
        Medico m2 = new Medico("Dr. Pedro Lima", "CRM5678");
        sistema.adicionarMedico(m1);
        sistema.adicionarMedico(m2);

        // Criando pacientes
        Paciente p1 = new Paciente("João Pereira", "11111111111");
        Paciente p2 = new Paciente("Maria Souza", "22222222222");
        Paciente p3 = new Paciente("Carlos Mendes", "33333333333");
        sistema.adicionarPaciente(p1);
        sistema.adicionarPaciente(p2);
        sistema.adicionarPaciente(p3);

        // Agendando consultas
        sistema.agendarConsulta(m1, p1, LocalDateTime.of(2025, 9, 6, 10, 0));
        sistema.agendarConsulta(m1, p2, LocalDateTime.of(2025, 9, 6, 11, 0));
        sistema.agendarConsulta(m2, p3, LocalDateTime.of(2025, 9, 7, 9, 0));
        sistema.agendarConsulta(m1, p1, LocalDateTime.of(2025, 9, 10, 15, 0));

        // Listar pacientes do médico
        sistema.listarPacientesDoMedico("CRM1234");

        // Exibir próximas consultas
        sistema.exibirProximasConsultas();
    }
}