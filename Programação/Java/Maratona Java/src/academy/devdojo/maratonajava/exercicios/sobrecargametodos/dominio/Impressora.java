package academy.devdojo.maratonajava.exercicios.sobrecargametodos.dominio;

public class Impressora {
    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public void imprimir(int numero) {
        System.out.println(numero);
    }

    public void imprimir(String texto, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println(texto);
        }
    }
}