package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDois() {
        System.out.println(10 + 10);
    }

    public void subtraiDois() {
        System.out.println(21 - 2);
    }

    public void multiplicaDois(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDois(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDois02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDois(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDois(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do alteraDois");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(int ...numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }
}