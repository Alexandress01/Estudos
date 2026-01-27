package academy.devdojo.maratonajava.exercicios.colecoes.test;

import academy.devdojo.maratonajava.exercicios.colecoes.dominio.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PessoaPorIdadeComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Integer.compare(p2.getIdade(), p1.getIdade());
    }
}

public class PessoaSortListTest {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Lutero", "444.333.222-11", 33));
        pessoas.add(new Pessoa("Bullinger", "111.222.333-44", 27));
        pessoas.add(new Pessoa("Calvino", "555.444.333-22", 23));
        pessoas.add(new Pessoa("Zuínglio", "122.233.344-45", 35));

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