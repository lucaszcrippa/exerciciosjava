
package exerci6;

public class Exerci6 {

    public static void main(String[] args) {
          SistemaRevendedora sistema = new SistemaRevendedora();

        // Criando marcas
        Marca marca1 = new Marca("Toyota");
        Marca marca2 = new Marca("Honda");
        Marca marca3 = new Marca("Ford");

        // Criando vendedores
        Vendedor v1 = new Vendedor("Lucas", "V001");
        Vendedor v2 = new Vendedor("Aline", "V002");
        sistema.adicionarVendedor(v1);
        sistema.adicionarVendedor(v2);

        // Criando carros e adicionando ao estoque
        Carro c1 = new Carro("Corolla", marca1, 95000);
        Carro c2 = new Carro("Civic", marca2, 97000);
        Carro c3 = new Carro("Fiesta", marca3, 45000);
        Carro c4 = new Carro("Hilux", marca1, 180000);

        sistema.adicionarCarroAoEstoque(c1);
        sistema.adicionarCarroAoEstoque(c2);
        sistema.adicionarCarroAoEstoque(c3);
        sistema.adicionarCarroAoEstoque(c4);

        // Registrando vendas
        sistema.registrarVenda(c1, v1);
        sistema.registrarVenda(c3, v2);

        // Calculando média por marca
        sistema.calcularMediaPrecoPorMarca("Toyota");
        sistema.calcularMediaPrecoPorMarca("Honda");

        // Exibindo carros vendidos por um vendedor
        sistema.exibirCarrosVendidosPorVendedor("V001");
        sistema.exibirCarrosVendidosPorVendedor("V003"); // inexistente
    }
}