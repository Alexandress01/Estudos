package academy.devdojo.maratonajava.exercicios.colecoes.test;

import academy.devdojo.maratonajava.exercicios.colecoes.dominio.Pessoa;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {

        // TreeSet mantém ordenado por nome (via compareTo da Pessoa)
        Set<Pessoa> pessoas = new TreeSet<>();

        // PriorityQueue prioriza os mais velhos
        Queue<Pessoa> maioresDeIdade = new PriorityQueue<>(new PessoaPorIdadeComparator());

        pessoas.add(new Pessoa("Lutero", "444.333.222-11", 33));
        pessoas.add(new Pessoa("Bullinger", "111.222.333-44", 27));
        pessoas.add(new Pessoa("Calvino", "555.444.333-22", 23));
        pessoas.add(new Pessoa("Bento IX", "012.034.056-07", 12));
        pessoas.add(new Pessoa("Zuínglio", "122.233.344-45", 35));
        pessoas.add(new Pessoa("Aleki", "777.606.555-44", 16));

        Iterator<Pessoa> iterator = pessoas.iterator();

        // Remove menores e envia maiores para a fila
        while (iterator.hasNext()) {
            Pessoa next = iterator.next();

            if (next.getIdade() >= 18) {
                maioresDeIdade.add(next);
            } else {
                iterator.remove();
            }
        }

        System.out.println("TreeSet (ordenado por nome):");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.getIdade());
        }

        System.out.println("\nPriorityQueue (mais velhos primeiro):");
        while (!maioresDeIdade.isEmpty()) {
            Pessoa poll = maioresDeIdade.poll();
            System.out.println(poll.getNome() + " - " + poll.getIdade());
        }
    }
}