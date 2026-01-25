package academy.devdojo.maratonajava.exercicios.colecoes.setehashset.dominio;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, int idade) {
        this(nome, cpf);
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        int nomeCompare = this.nome.compareTo(outraPessoa.getNome());
        if (nomeCompare != 0) return nomeCompare;
        return this.cpf.compareTo(outraPessoa.getCpf());
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}