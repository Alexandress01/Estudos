package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Aldaberto";
        funcionario.idade = 37;
        funcionario.salarios = new float[]{2000F, 3400.80F, 4000F};

        funcionario.imprimeDados();
    }
}