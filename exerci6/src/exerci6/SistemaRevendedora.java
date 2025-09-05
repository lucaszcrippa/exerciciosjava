
package exerci6;

import java.util.*;

public class SistemaRevendedora {
    private List<Carro> estoque;
    private List<Venda> vendas;
    private List<Vendedor> vendedores;

    public SistemaRevendedora() {
        estoque = new ArrayList<>();
        vendas = new ArrayList<>();
        vendedores = new ArrayList<>();
    }

    public void adicionarCarroAoEstoque(Carro carro) {
        estoque.add(carro);
        System.out.println("✅ Carro adicionado ao estoque: " + carro);
    }

    public void registrarVenda(Carro carro, Vendedor vendedor) {
        if (estoque.contains(carro)) {
            estoque.remove(carro);
            vendas.add(new Venda(carro, vendedor));
            System.out.println("✅ Venda registrada: " + carro + " vendido por " + vendedor.getNome());
        } else {
            System.out.println("❌ Carro não está disponível no estoque.");
        }
    }

    public void calcularMediaPrecoPorMarca(String nomeMarca) {
        double soma = 0;
        int count = 0;

        for (Carro carro : estoque) {
            if (carro.getMarca().getNome().equalsIgnoreCase(nomeMarca)) {
                soma += carro.getPreco();
                count++;
            }
        }

        if (count > 0) {
            double media = soma / count;
            System.out.printf("💰 Média de preços da marca %s: R$%.2f%n", nomeMarca, media);
        } else {
            System.out.println("⚠️ Nenhum carro dessa marca no estoque.");
        }
    }

    public void exibirCarrosVendidosPorVendedor(String idVendedor) {
        System.out.println("\n=== Carros vendidos pelo vendedor ID " + idVendedor + " ===");
        boolean encontrou = false;
        for (Venda venda : vendas) {
            if (venda.getVendedor().getId().equals(idVendedor)) {
                System.out.println(venda.getCarro());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma venda registrada para este vendedor.");
        }
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }
}