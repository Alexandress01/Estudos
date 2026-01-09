package academy.devdojo.maratonajava.exercicios.io.test.exercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaSimples {
    public static void main(String[] args) {
        File arquivo = new File("src/academy/devdojo/maratonajava/exercicios/io/test/exercicio2/arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            bw.write("Olá, mundo!");
            bw.newLine();
            bw.write("Aprendendo Java IO.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}