package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Intel Core i9", 5000);

        Tomate tomate = new Tomate("Tomate Americano", 20);

        tomate.setDataValidade("18/12/2035");

        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("-----------------------------");

        CalculadoraImposto.calcularImposto(produto);
    }
}
