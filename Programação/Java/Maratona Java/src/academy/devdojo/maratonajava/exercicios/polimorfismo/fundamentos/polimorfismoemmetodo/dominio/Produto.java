package academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.polimorfismoemmetodo.dominio;

public abstract class Produto {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public abstract double calcularImposto();

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}