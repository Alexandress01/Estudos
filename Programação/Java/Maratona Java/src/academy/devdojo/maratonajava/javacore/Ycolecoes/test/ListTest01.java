package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16); // 1.5
        List<String> nomes2 = new ArrayList<>(16);

        nomes.add("Alexandre");
        nomes.add("DevDojo");

        nomes2.add("Santos");
        nomes2.add("Academy");

//        nomes.remove("Alexandre");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Santos");

        System.out.println("--------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);

        System.out.println("--------------------");

        List<Integer> numeros = new ArrayList<>(16);

        numeros.add(1);
        numeros.add(15);
        numeros.add(7);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("--------------------");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println(numeros);
    }
}