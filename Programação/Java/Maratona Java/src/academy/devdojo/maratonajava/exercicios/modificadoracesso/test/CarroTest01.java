package academy.devdojo.maratonajava.exercicios.modificadoracesso.test;

import academy.devdojo.maratonajava.exercicios.modificadoracesso.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setVelocidade(100);
        System.out.println("Velocidade do Carro: " + carro.getVelocidade());
    }
}