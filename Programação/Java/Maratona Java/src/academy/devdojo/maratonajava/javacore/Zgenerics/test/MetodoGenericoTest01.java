package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarListComObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarListComObjeto(T t) {
        return List.of(t);
    }
}