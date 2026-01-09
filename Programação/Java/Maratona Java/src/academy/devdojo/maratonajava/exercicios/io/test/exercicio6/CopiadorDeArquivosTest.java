package academy.devdojo.maratonajava.exercicios.io.test.exercicio6;

import java.io.*;

public class CopiadorDeArquivosTest {
    public static void main(String[] args) {
        File arquivoOrigem = new File("src/academy/devdojo/maratonajava/exercicios/io/test/exercicio6/origem.txt");
        File arquivoCopia = new File("src/academy/devdojo/maratonajava/exercicios/io/test/exercicio6/copia.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoOrigem));
             BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCopia))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);

                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
