package academy.devdojo.maratonajava.exercicios.polimorfismo.abstracao.dominio;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}