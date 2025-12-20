package academy.devdojo.maratonajava.exercicios.polimorfismo.abstracao.test;

import academy.devdojo.maratonajava.exercicios.polimorfismo.abstracao.dominio.Circulo;
import academy.devdojo.maratonajava.exercicios.polimorfismo.abstracao.dominio.Forma;
import academy.devdojo.maratonajava.exercicios.polimorfismo.abstracao.dominio.ImpressoraArea;
import academy.devdojo.maratonajava.exercicios.polimorfismo.abstracao.dominio.Quadrado;

public class FormaTest {
    public static void main(String[] args) {
        Forma forma1 = new Quadrado("Quadrado Alpha Redpill", 12);
        Forma forma2 = new Circulo("Círculo Beta Bluepill", 22);

        ImpressoraArea.imprimirArea(forma1);
        System.out.println("----------------------------");
        ImpressoraArea.imprimirArea(forma2);
    }
}