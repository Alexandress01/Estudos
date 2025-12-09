package academy.devdojo.maratonajava.exercicios.construtores.test;

import academy.devdojo.maratonajava.exercicios.construtores.dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Alexandre Santos");

        conta.depositar(200);
        conta.sacar(100);

        conta.sacar(300);
    }
}