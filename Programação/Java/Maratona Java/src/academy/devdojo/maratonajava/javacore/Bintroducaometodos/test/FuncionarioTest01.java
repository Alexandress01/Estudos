package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Aldaberto");
        funcionario.setIdade(37);
        funcionario.setSalarios(new float[]{2000F, 3400.80F, 4000F});

        funcionario.imprimeDados();
        System.out.println("Média: " + funcionario.getMedia());
    }
}