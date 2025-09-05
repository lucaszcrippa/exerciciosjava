
package exerci4;

public class Exerci4 {

    public static void main(String[] args) {
       SistemaReservas sistema = new SistemaReservas();

        // Criando voos
        Voo voo1 = new Voo("AB123", "São Paulo", "Rio de Janeiro", 2);
        Voo voo2 = new Voo("CD456", "Belo Horizonte", "Brasília", 1);

        sistema.adicionarVoo(voo1);
        sistema.adicionarVoo(voo2);

        // Criando passageiros
        Passageiro p1 = new Passageiro("João Silva", "12345678900");
        Passageiro p2 = new Passageiro("Maria Oliveira", "98765432100");

        // Listando voos disponíveis
        sistema.listarVoosDisponiveis();

        // Fazendo reservas
        sistema.fazerReserva(p1, "AB123");
        sistema.fazerReserva(p2, "AB123");
        sistema.fazerReserva(p2, "CD456");

        // Tentando reservar voo lotado
        sistema.fazerReserva(p1, "CD456"); // Deve falhar

        // Listando reservas de um passageiro
        sistema.listarReservasDoPassageiro("98765432100");

        // Listando reservas de passageiro sem reserva
        sistema.listarReservasDoPassageiro("00000000000");
    }
}