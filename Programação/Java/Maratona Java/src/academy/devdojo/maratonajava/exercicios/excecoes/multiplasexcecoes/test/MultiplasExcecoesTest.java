package academy.devdojo.maratonajava.exercicios.excecoes.multiplasexcecoes.test;

public class MultiplasExcecoesTest {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);

            int x = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}