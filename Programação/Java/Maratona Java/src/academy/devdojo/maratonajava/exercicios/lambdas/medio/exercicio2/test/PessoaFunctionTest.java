package academy.devdojo.maratonajava.exercicios.lambdas.medio.exercicio2.test;

import academy.devdojo.maratonajava.exercicios.lambdas.medio.exercicio2.dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PessoaFunctionTest {
    public static void main(String[] args) {
        Function<String, Pessoa> pessoasFunction = Pessoa::new;
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa kazuma = pessoasFunction.apply("Kazuma");
        Pessoa aqua = pessoasFunction.apply("Aqua");
        Pessoa darkness = pessoasFunction.apply("Darkness");
        Pessoa megumin = pessoasFunction.apply("Megumin");

        System.out.println(kazuma);
        System.out.println(aqua);
        System.out.println(darkness);
        System.out.println(megumin);
    }
}