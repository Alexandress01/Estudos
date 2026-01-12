package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");

        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        DosFileAttributes dfa = Files.readAttributes(path, DosFileAttributes.class);

        System.out.println(dfa.isHidden());
        System.out.println(dfa.isReadOnly());

        DosFileAttributeView fav = Files.getFileAttributeView(path, DosFileAttributeView.class);

        fav.setHidden(true);
        fav.setReadOnly(true);

        System.out.println(fav.readAttributes().isHidden());
        System.out.println(fav.readAttributes().isReadOnly());
    }
}
