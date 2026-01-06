package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O Aleki é lindo, o melhor programador do Brasillllllllll");
            bw.newLine();
            bw.write("Continuando a cantoria na próxima linha");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
