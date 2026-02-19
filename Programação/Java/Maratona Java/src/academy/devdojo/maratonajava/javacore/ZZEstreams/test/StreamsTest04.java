package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();

        List<String> gaphicDesigners = List.of("Alexandre Santos", "Henry Cavill", "Romeu Zema");
        List<String> developers = List.of("Alexandre", "Robert Downey Junior", "Ronaldo Caiado");
        List<String> students = List.of("Alexandre", "Jim Carrey", "Cláudio Castro");

        devdojo.add(gaphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("--------------");

        devdojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);

    }
}