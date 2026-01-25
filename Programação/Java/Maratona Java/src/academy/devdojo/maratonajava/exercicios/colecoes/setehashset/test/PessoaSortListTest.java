package academy.devdojo.maratonajava.exercicios.colecoes.setehashset.test;

import academy.devdojo.maratonajava.exercicios.colecoes.setehashset.dominio.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PessoaPorIdadeComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Integer.compare(pessoa1.getIdade(), pessoa2.getIdade());
    }
}

public class PessoaSortListTest {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Lutero", "444.333.222-11", 33));
        pessoas.add(new Pessoa("Bullinger", "111.222.333-44", 27));
        pessoas.add(new Pessoa("Calvino", "555.444.333-22", 23));
        pessoas.add(new Pessoa("Zuínglio", "111.222.333-44", 35));

        Collections.sort(pessoas);
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " CPF: " + pessoa.getCpf() + " Idade: " + pessoa.getIdade());
        }

        System.out.println("-------------------------------------------");

        pessoas.sort(new PessoaPorIdadeComparator());
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " CPF: " + pessoa.getCpf() + " Idade: " + pessoa.getIdade());
        }
    }
}