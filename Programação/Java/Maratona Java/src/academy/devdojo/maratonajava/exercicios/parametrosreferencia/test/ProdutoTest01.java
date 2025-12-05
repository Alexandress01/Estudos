package academy.devdojo.maratonajava.exercicios.parametrosreferencia.test;

import academy.devdojo.maratonajava.exercicios.parametrosreferencia.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Smartphone Samsung A03";
        produto.preco = 700;

        produto.imprime();
        produto.aplicarDesconto(produto);
    }
}