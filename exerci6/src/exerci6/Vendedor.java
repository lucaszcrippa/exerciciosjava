
package exerci6;

public class Vendedor {
     private String nome;
    private String id;

    public Vendedor(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ")";
    }
}