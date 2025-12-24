package academy.devdojo.maratonajava.exercicios.excecoes.blocofinally.test;

public class BlocoFinallyTest {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo conexão...");
            int x = 10 / 0;
        } finally {
            System.out.println("Fechando conexão...");
        }
    }
}