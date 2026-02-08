package academy.devdojo.maratonajava.exercicios.lambdas.medio.exercicio2.dominio;

public class Pessoa {
    private String name;

    public Pessoa(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                '}';
    }
}
