
package exerci9;

import java.time.LocalDateTime;

public class Exerci9 {

    public static void main(String[] args) {
         Restaurante restaurante = new Restaurante();

        // Criando pratos
        Prato p1 = new Prato("Pizza Margherita", 35.0);
        Prato p2 = new Prato("Lasanha", 28.5);
        Prato p3 = new Prato("Salada Caesar", 18.0);

        restaurante.adicionarPrato(p1);
        restaurante.adicionarPrato(p2);
        restaurante.adicionarPrato(p3);

        // Criando mesas
        Mesa m1 = new Mesa(1);
        Mesa m2 = new Mesa(2);

        restaurante.adicionarMesa(m1);
        restaurante.adicionarMesa(m2);

        // Criando pedidos
        restaurante.criarPedido(1, p1);
        restaurante.criarPedido(1, p2);
        restaurante.criarPedido(2, p3);

        // Calculando contas
        restaurante.calcularConta(1);
        restaurante.calcularConta(2);

        // Fazendo reservas
        restaurante.fazerReserva("João", 1, LocalDateTime.of(2025, 9, 10, 19, 0));
        restaurante.fazerReserva("Maria", 2, LocalDateTime.of(2025, 9, 11, 20, 30));
        restaurante.fazerReserva("Carlos", 1, LocalDateTime.of(2024, 8, 1, 18, 0)); // passada

        // Exibindo reservas futuras
        restaurante.exibirReservasFuturas();
    }
}