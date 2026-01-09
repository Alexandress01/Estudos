package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/aleki");
        Path arquivo = Paths.get("dev/arquivo.txt");

        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/aleki");
        Path relative = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1º:" + absolute.resolve(resolve));
        System.out.println("2º:" + absolute.resolve(file));
        System.out.println("3º:" + relative.resolve(absolute));
        System.out.println("4º:" + relative.resolve(file));
        System.out.println("5º:" + file.resolve(absolute));
        System.out.println("6º:" + file.resolve(relative));
    }
}