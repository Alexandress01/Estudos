package academy.devdojo.maratonajava.exercicios.modificadoracesso.test;

import academy.devdojo.maratonajava.exercicios.modificadoracesso.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Alexandre Silva Santos");
        aluno.setNota(10);

        aluno.imprime();

        System.out.println("-----------------------------");

        aluno.setNome("");
        aluno.setNota(18);
    }
}