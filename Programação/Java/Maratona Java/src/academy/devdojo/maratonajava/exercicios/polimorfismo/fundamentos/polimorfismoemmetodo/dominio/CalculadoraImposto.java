package academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.dominio;

public class CalculadoraImposto {
    public static void imprimirImposto(Produto produto) {
        System.out.println("--- Relatório de Imposto ---");
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço do Produto: R$ " + produto.getValor());
        System.out.println("Imposto: R$ " + produto.calcularImposto());
    }
}