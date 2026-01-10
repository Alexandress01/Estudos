package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta_renomeada/new.txt");

        BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = bfa.creationTime();
        FileTime lastModifiedTime = bfa.lastModifiedTime();
        FileTime lastAcessTime = bfa.lastAccessTime();

        System.out.println("CreationTime: " + creationTime);
        System.out.println("LastModifiedTime: " + lastModifiedTime);
        System.out.println("LastAcessTime: " + lastAcessTime);

        System.out.println("------------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastAcessTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newLastAcessTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAcessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("CreationTime: " + creationTime);
        System.out.println("LastModifiedTime: " + lastModifiedTime);
        System.out.println("LastAcessTime: " + lastAcessTime);
    }
}
