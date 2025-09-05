
package exerci9;


import java.util.ArrayList;
import java.util.List;

public class Mesa {
   private int numero;
    private List<Pedido> pedidos;

    public Mesa(int numero) {
        this.numero = numero;
        this.pedidos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public double calcularTotalConta() {
        double total = 0;
        for (Pedido p : pedidos) {
            total += p.getPrato().getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Mesa " + numero;
    }
}