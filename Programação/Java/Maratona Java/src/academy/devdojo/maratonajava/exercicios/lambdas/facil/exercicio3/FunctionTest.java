package academy.devdojo.maratonajava.exercicios.lambdas.facil.exercicio3;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = String::length;

        System.out.println(stringLength.apply("Lutero"));
        System.out.println(stringLength.apply("Calvino"));
        System.out.println(stringLength.apply("Zwinglio"));
    }
}