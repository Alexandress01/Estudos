package academy.devdojo.maratonajava.exercicios.construtores.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
