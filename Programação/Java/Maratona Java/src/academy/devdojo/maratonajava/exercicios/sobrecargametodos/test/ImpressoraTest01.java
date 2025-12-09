package academy.devdojo.maratonajava.exercicios.sobrecargametodos.test;

import academy.devdojo.maratonajava.exercicios.sobrecargametodos.dominio.Impressora;

public class ImpressoraTest01 {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();

        System.out.println("-----------------------");
        impressora.imprimir("Alexandre");
        System.out.println("-----------------------");
        impressora.imprimir(16);
        System.out.println("-----------------------");
        impressora.imprimir("Aleki gostoso", 2);
        System.out.println("-----------------------");
    }
}