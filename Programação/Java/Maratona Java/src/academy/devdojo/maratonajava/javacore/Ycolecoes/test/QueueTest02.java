package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangaQueue = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        mangaQueue.add(new Manga(5L, "Hellsing Ultimate", 19.99, 0));
        mangaQueue.add(new Manga(1L, "Beserk", 9.5, 5));
        mangaQueue.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangaQueue.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangaQueue.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangaQueue.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangaQueue.add(new Manga(10L, "Aaragon", 2.99, 0));

        while (!mangaQueue.isEmpty()) {
            System.out.println(mangaQueue.poll());
        }
    }
}