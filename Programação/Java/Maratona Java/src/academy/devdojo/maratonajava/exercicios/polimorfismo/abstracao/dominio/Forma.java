package academy.devdojo.maratonajava.exercicios.polimorfismo.abstracao.dominio;

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    public String getNome() {
        return nome;
    }
}