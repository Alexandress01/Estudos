package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // armazenando o return numa variável
        double resultadoDivisao = calculadora.divideDois(20, 2);

        System.out.println(resultadoDivisao);

        System.out.println("--------------------------------");

        // printando diretamente
        System.out.println(calculadora.divideDois(20, 0));
        System.out.println(calculadora.divideDois02(20, 2));

        System.out.println("--------------------------------");

        calculadora.imprimeDivisaoDois(86, 0);
    }
}