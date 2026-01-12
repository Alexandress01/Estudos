package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/aleki/dev/file.txt");
        PosixFileAttributes pfa = Files.readAttributes(path, PosixFileAttributes.class);

        System.out.println(pfa.permissions());

        PosixFileAttributeView fav = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> pfp = PosixFilePermissions.fromString("rw-rw-rw");
        fav.setPermissions(pfp);

        System.out.println(fav.readAttributes().permissions());
    }
}
