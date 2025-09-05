
package exerci4;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
 private List<Voo> voos;
    private List<Reserva> reservas;

    public SistemaReservas() {
        voos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public void listarVoosDisponiveis() {
        System.out.println("\n=== Voos disponíveis ===");
        for (Voo voo : voos) {
            if (voo.temDisponibilidade()) {
                System.out.println(voo);
            }
        }
    }

    public boolean fazerReserva(Passageiro passageiro, String codigoVoo) {
        for (Voo voo : voos) {
            if (voo.getCodigo().equalsIgnoreCase(codigoVoo)) {
                if (voo.temDisponibilidade()) {
                    Reserva reserva = new Reserva(passageiro, voo);
                    voo.adicionarReserva(reserva);
                    reservas.add(reserva);
                    System.out.println("✅ Reserva realizada com sucesso para " + passageiro.getNome());
                    return true;
                } else {
                    System.out.println("❌ Voo sem vagas disponíveis.");
                    return false;
                }
            }
        }
        System.out.println("❌ Voo não encontrado.");
        return false;
    }

    public void listarReservasDoPassageiro(String cpf) {
        System.out.println("\n=== Reservas do passageiro (CPF: " + cpf + ") ===");
        boolean encontrou = false;
        for (Reserva reserva : reservas) {
            if (reserva.getPassageiro().getCpf().equals(cpf)) {
                System.out.println(reserva);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma reserva encontrada.");
        }
    }
}
