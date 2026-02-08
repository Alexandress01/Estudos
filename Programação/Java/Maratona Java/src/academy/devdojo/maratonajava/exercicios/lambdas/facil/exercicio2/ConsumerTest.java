package academy.devdojo.maratonajava.exercicios.lambdas.facil.exercicio2;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> upperString = s -> System.out.println(s.toUpperCase());

        upperString.accept("abacaxi");
        upperString.accept("laranja");
        upperString.accept("ameixa");
    }
}
