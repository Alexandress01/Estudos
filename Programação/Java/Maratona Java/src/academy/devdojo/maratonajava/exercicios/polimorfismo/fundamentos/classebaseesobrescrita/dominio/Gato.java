package academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.classebaseesobrescrita.dominio;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Som do gato: Miau...");
    }
}