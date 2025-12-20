package academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.test;

import academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.dominio.CalculadoraImposto;
import academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.dominio.Produto;
import academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.dominio.ProdutoDigital;
import academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.dominio.ProdutoFisico;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new ProdutoFisico("Notebook Asus i3",2100);
        Produto produto2 = new ProdutoDigital("Assinatura Netflix", 20);

        CalculadoraImposto.imprimirImposto(produto1);
        CalculadoraImposto.imprimirImposto(produto2);
    }
}