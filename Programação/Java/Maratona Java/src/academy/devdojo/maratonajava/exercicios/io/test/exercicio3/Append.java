package academy.devdojo.maratonajava.exercicios.io.test.exercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append {
    public static void main(String[] args) {
        File arquivo = new File("src/academy/devdojo/maratonajava/exercicios/io/test/exercicio3/arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            bw.write("Execução em: 07/01/26 às 19:40");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}