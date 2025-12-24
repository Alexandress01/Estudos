package academy.devdojo.maratonajava.exercicios.excecoes.excecaocustomizada.test;

import academy.devdojo.maratonajava.exercicios.excecoes.excecaocustomizada.dominio.ContaBancaria;
import academy.devdojo.maratonajava.exercicios.excecoes.excecaocustomizada.dominio.SaldoInsuficienteException;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        try {
            System.out.println(contaBancaria.sacar(1200));
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}