package academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.classebaseesobrescrita.dominio;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Som do cachorro: Au au!");
    }
}