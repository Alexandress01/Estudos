package academy.devdojo.maratonajava.exercicios.polimorfismo.abstracao.dominio;

public class ImpressoraArea {
    public static void imprimirArea(Forma forma) {
        System.out.println("Forma: " + forma.getNome());
        System.out.println("Área: " + forma.calcularArea());
    }
}