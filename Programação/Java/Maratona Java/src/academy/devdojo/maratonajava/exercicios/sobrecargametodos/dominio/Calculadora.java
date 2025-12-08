package academy.devdojo.maratonajava.exercicios.sobrecargametodos.dominio;

public class Calculadora {
    public void somar(int num1, int num2) {
        System.out.println("-----------------------");
        System.out.println("Resultado da Soma de Inteiros: " + (num1 + num2));
    }

    public void somar(double num1, double num2) {
        System.out.println("-----------------------");
        System.out.println("Resultado da Soma de Doubles: " + (num1 + num2));
    }

    public void somar(int num1, int num2, int num3) {
        System.out.println("-----------------------");
        System.out.println("Resultado da Soma de Três Inteiros: " + (num1 + num2 + num3));
    }
}