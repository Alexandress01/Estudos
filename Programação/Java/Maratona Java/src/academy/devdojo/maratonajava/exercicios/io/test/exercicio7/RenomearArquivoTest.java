package academy.devdojo.maratonajava.exercicios.io.test.exercicio7;

import java.io.File;
import java.io.IOException;

public class RenomearArquivoTest {
    public static void main(String[] args) {
        File arquivoTeste = new File("src/academy/devdojo/maratonajava/exercicios/io/test/exercicio7/teste.txt");
        File arquivoTesteRenomeado = new File("src/academy/devdojo/maratonajava/exercicios/io/test/exercicio7/teste_renomeado.txt");

        try {
            boolean created = arquivoTeste.createNewFile();

            System.out.println("Arquivo criado agora? " + created);
            System.out.println("Nome do arquivo: " + arquivoTeste.getName());

            boolean renamed = arquivoTeste.renameTo(arquivoTesteRenomeado);

            System.out.println("Foi renomeado? " + renamed);
            System.out.println("Novo nome: " + arquivoTesteRenomeado.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}