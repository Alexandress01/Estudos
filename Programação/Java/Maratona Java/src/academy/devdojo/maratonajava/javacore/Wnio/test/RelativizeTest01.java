package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/aleki");
        Path clazz = Paths.get("/home/aleki/devfoda/OlaMundo.java");

        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/aleki");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/aleki/devfoda/OlaMundo.java");

        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.2021921");

        System.out.println("1º:" + absolute1.relativize(absolute3));
        System.out.println("2º:" + absolute3.relativize(absolute1));
        System.out.println("3º:" + absolute1.relativize(absolute2));
        System.out.println("4º:" + relative1.relativize(relative2));
        System.out.println("5º:" + absolute1.relativize(relative1));
    }
}
