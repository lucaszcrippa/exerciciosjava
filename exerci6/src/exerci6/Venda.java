
package exerci6;

public class Venda {
    private Carro carro;
    private Vendedor vendedor;

    public Venda(Carro carro, Vendedor vendedor) {
        this.carro = carro;
        this.vendedor = vendedor;
    }

    public Carro getCarro() {
        return carro;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    @Override
    public String toString() {
        return carro.toString() + " - Vendido por: " + vendedor.getNome();
    }
}