package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Tokyo Ghoul", "Shonen", 12, "Pierrot");
        Anime anime2 = new Anime();

        anime.imprime();

        System.out.println("-------------------------");

        anime2.imprime();
    }
}