package academy.devdojo.maratonajava.exercicios.io.test.exercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeituraLinhaPorLinha {
    public static void main(String[] args) {
        File arquivo = new File("src/academy/devdojo/maratonajava/exercicios/io/test/exercicio4/arquivo.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}