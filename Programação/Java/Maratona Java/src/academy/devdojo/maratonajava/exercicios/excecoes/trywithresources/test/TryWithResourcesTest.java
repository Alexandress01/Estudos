package academy.devdojo.maratonajava.exercicios.excecoes.trywithresources.test;

import java.util.Scanner;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            int num = teclado.nextInt();
            System.out.println(num);
        }
    }
}