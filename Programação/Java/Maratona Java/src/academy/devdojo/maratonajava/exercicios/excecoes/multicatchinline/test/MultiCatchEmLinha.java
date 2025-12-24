package academy.devdojo.maratonajava.exercicios.excecoes.multicatchinline.test;

public class MultiCatchEmLinha {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);

            int x = 5 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}