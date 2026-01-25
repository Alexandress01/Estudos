package academy.devdojo.maratonajava.exercicios.colecoes.setehashset.test;

import academy.devdojo.maratonajava.exercicios.colecoes.setehashset.dominio.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class PessoaListTest {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("Alexandre", "012.345.678-99"));
        pessoas.add(new Pessoa("Rafael", "012.345.678-99"));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " - " + "CPF: " + pessoa.getCpf());
        }
    }
}