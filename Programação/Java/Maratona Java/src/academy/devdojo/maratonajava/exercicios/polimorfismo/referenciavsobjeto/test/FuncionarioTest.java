package academy.devdojo.maratonajava.exercicios.polimorfismo.referenciavsobjeto.test;

import academy.devdojo.maratonajava.exercicios.polimorfismo.referenciavsobjeto.dominio.Funcionario;
import academy.devdojo.maratonajava.exercicios.polimorfismo.referenciavsobjeto.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario f = new Gerente(2000, 300);

        if (f instanceof Gerente) {
            Gerente g = (Gerente) f;
            System.out.println(g.getBonus());
        }
    }
}