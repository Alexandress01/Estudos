package academy.devdojo.maratonajava.exercicios.parametrosreferencia.dominio;

public class Ponto {
    public int x;
    public int y;

    public void trocar(Ponto ponto1, Ponto ponto2) {
        System.out.println("X do ponto 1: " + ponto1.x);
        System.out.println("Y do ponto 1: " + ponto1.y);

        System.out.println("X do ponto 2: " + ponto2.x);
        System.out.println("Y do ponto 2: " + ponto2.y);

        int tempX = ponto1.x;
        int tempY = ponto1.y;

        ponto1.x = ponto2.x;
        ponto1.y = ponto2.y;

        ponto2.x = tempX;
        ponto2.y = tempY;

        System.out.println("--------------troca--------------");

        System.out.println("X do ponto 1: " + ponto1.x);
        System.out.println("Y do ponto 1: " + ponto1.y);

        System.out.println("X do ponto 2: " + ponto2.x);
        System.out.println("Y do ponto 2: " + ponto2.y);
    }
}
