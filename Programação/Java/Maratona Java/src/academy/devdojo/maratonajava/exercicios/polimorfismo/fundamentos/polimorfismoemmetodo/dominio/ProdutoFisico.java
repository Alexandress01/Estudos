package academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.dominio;

public class ProdutoFisico extends Produto {
    public ProdutoFisico(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.getValor() * 0.12;
    }
}