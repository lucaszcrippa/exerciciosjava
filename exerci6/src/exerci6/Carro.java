
package exerci6;

public class Carro {
    private String modelo;
    private Marca marca;
    private double preco;

    public Carro(String modelo, Marca marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return modelo + " - " + marca.getNome() + " - R$" + preco;
    }
}
