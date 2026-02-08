package academy.devdojo.maratonajava.exercicios.lambdas.medio.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterMapForEachTest {
    public static void main(String[] args) {
        List<String> nomes = List.of("Alex", "Bruno", "Ana", "João", "Alice");

        forEach(map(filter(nomes, s -> s.startsWith("A")), String::toUpperCase));

        nomes.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
    }

    public static List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();

        for (String e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

    public static List<String> map(List<String> list, Function<String, String> function) {
        List<String> upperString = new ArrayList<>();

        for (String e : list) {
            String result = function.apply(e);
            upperString.add(result);
        }
        return upperString;
    }

    public static void forEach(List<String> list) {
        for (String e : list) {
            System.out.println(e);
        }
    }
}