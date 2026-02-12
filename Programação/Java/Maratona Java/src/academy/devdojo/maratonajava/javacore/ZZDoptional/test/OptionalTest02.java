package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Dragon Ball Z");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Dragon Ball Z Remake"));

        System.out.println(mangaByTitle);

        Optional<Manga> mangaById = MangaRepository.findById(2);
        mangaById.orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Optional<Manga> newManga = MangaRepository.findByTitle("JoJo no Kimyō na Bōken");
        newManga.orElseGet(() -> new Manga(3, "JoJo no Kimyō na Bōken", 900));

        System.out.println(newManga);
    }
}