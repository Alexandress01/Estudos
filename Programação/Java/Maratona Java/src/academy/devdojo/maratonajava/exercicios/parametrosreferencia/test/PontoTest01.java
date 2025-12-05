package academy.devdojo.maratonajava.exercicios.parametrosreferencia.test;

import academy.devdojo.maratonajava.exercicios.parametrosreferencia.dominio.Ponto;

public class PontoTest01 {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto();

        ponto1.x = 200;
        ponto1.y = 50;

        ponto2.x = 100;
        ponto2.y = 80;

        ponto1.trocar(ponto1, ponto2);
    }
}
