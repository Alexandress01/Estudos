package academy.devdojo.maratonajava.exercicios.colecoes.test;

import academy.devdojo.maratonajava.exercicios.colecoes.dominio.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class PessoaMapTest {
    public static void main(String[] args) {
        Map<String, Pessoa> pessoasPorCpf = new HashMap<>();

        pessoasPorCpf.put("444.333.222-11", new Pessoa("Lutero", "444.333.222-11", 33));
        pessoasPorCpf.put("555.444.333-22", new Pessoa("Calvino", "555.444.333-22", 23));
        pessoasPorCpf.put("111.222.333-44", new Pessoa("Zuínglio", "111.222.333-44", 23));

        Pessoa pessoa = pessoasPorCpf.get("454.343.232-12");

        if (pessoa != null) {
            System.out.println(pessoa.getNome());
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }
}