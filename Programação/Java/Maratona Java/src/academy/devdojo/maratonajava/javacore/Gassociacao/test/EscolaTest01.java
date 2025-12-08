package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Rinaldo");
        Professor professor2 = new Professor("Marcos");
        Professor professor3 = new Professor("Jefferson");

        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Ceeptic", professores);

        escola.imprime();
    }
}
