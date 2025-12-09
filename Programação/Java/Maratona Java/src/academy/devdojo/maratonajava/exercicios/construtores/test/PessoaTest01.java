package academy.devdojo.maratonajava.exercicios.construtores.test;

import academy.devdojo.maratonajava.exercicios.construtores.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Aleki", 16);

        System.out.println("----- Pessoa 1 -----");
        pessoa1.imprime();
        System.out.println("----- Pessoa 2 -----");
        pessoa2.imprime();
    }
}
