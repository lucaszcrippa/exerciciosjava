
package exerci5;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
 private Medico medico;
    private Paciente paciente;
    private LocalDateTime dataHora;

    public Consulta(Medico medico, Paciente paciente, LocalDateTime dataHora) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Consulta em " + dataHora.format(fmt) + " - Dr(a). " + medico.getNome() + " com " + paciente.getNome();
    }
}