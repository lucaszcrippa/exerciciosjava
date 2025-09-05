
package exerci4;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String codigo;
    private String origem;
    private String destino;
    private int capacidade;
    private List<Reserva> reservas;

    public Voo(String codigo, String origem, String destino, int capacidade) {
        this.codigo = codigo;
        this.origem = origem;
        this.destino = destino;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean temDisponibilidade() {
        return reservas.size() < capacidade;
    }

    public boolean adicionarReserva(Reserva reserva) {
        if (temDisponibilidade()) {
            reservas.add(reserva);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Voo " + codigo + ": " + origem + " -> " + destino + " (Disponíveis: " + (capacidade - reservas.size()) + ")";
    }
}