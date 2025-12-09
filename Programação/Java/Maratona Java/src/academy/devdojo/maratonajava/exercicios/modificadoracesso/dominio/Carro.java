package academy.devdojo.maratonajava.exercicios.modificadoracesso.dominio;

public class Carro {
    private double velocidade;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double v) {
        if (v < 0) {
            this.velocidade = 0;
        } else if (v > 200) {
            this.velocidade = 200;
        } else {
            this.velocidade = v;
        }
    }
}