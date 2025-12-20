package academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.dominio;

public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.getValor() * 0.08;
    }
}