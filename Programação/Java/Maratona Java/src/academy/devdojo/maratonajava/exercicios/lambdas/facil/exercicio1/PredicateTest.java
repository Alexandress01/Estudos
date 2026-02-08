package academy.devdojo.maratonajava.exercicios.lambdas.facil.exercicio1;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> isGreaterThan10 = num -> num > 10;

        System.out.println(isGreaterThan10.test(11));
        System.out.println(isGreaterThan10.test(10));
        System.out.println(isGreaterThan10.test(100));

    }
}