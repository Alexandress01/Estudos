package academy.devdojo.maratonajava.exercicios.io.test.exercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContadorDeLinhas {
    public static void main(String[] args) {
        File arquivo = new File("src/academy/devdojo/maratonajava/exercicios/io/test/exercicio5/arquivo.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int quantidadeLinhas = 0;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
                quantidadeLinhas++;
            }
            System.out.println("Total de linhas: " + quantidadeLinhas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}