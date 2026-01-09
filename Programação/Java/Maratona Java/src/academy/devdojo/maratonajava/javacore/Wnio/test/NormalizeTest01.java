package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/aleki/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        System.out.println("------------------------------");

        Path path2 = Paths.get("/home/./aleki/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
