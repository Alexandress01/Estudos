package academy.devdojo.maratonajava.exercicios.sobrecargametodos.test;

import academy.devdojo.maratonajava.exercicios.sobrecargametodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar(12, 12);
        calculadora.somar(12.5, 2.1);
        calculadora.somar(20, 10, 9);
    }
}