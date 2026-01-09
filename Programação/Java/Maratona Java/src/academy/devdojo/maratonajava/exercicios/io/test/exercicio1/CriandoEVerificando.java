package academy.devdojo.maratonajava.exercicios.io.test.exercicio1;

import java.io.File;
import java.io.IOException;

public class CriandoEVerificando {
    public static void main(String[] args) {
        File fileTeste = new File("src/academy/devdojo/maratonajava/exercicios/io/test/teste.txt");

        try {
            if (fileTeste.exists()) {
                System.out.println("Arquivo já criado.");
            } else {
                boolean created = fileTeste.createNewFile();

                System.out.println("Nome do arquivo: " + fileTeste.getName());
                System.out.println("Caminho absoluto: " + fileTeste.getAbsolutePath());
                System.out.println("Já existe? " + created);
                System.out.println("É um diretório? " + fileTeste.isDirectory());
                System.out.println("É um arquivo? " + fileTeste.isFile());
                System.out.println("Pode ler? " + fileTeste.canRead());
                System.out.println("Pode escrever? " + fileTeste.canWrite());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}