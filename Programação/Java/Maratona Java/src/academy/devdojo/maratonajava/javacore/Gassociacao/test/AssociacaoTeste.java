package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Namekusei");

        Aluno aluno1 = new Aluno("Goku", 44);
        Aluno aluno2 = new Aluno("Vegeta", 48);
        Aluno[] alunosParaSeminario = {aluno1, aluno2};

        Professor professor1 = new Professor("Mestre Kame", "Arte Marcial");
        Professor[] professores = {professor1};

        Seminario seminario1 = new Seminario("Destruição do Planeta Saiyajin", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario1};

        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();
    }
}
