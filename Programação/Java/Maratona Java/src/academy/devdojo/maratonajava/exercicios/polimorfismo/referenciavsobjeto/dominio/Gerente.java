package academy.devdojo.maratonajava.exercicios.polimorfismo.referenciavsobjeto.dominio;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salario) {
        super(salario);
    }

    public Gerente(double salario, double bonus) {
        super(salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}