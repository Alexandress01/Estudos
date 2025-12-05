package academy.devdojo.maratonajava.exercicios.parametrosreferencia.dominio;

public class Produto {
    public String nome;
    public double preco;

    public void imprime() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
    }

    public void aplicarDesconto(Produto produto) {
        double desconto = 0.10;
        produto.preco -= produto.preco * desconto;

        System.out.println("Novo preço com o desconto de 10%: R$ " + produto.preco);
    }
}