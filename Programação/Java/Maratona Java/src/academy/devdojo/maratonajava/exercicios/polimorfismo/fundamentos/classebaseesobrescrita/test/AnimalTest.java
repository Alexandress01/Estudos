package academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.classebaseesobrescrita.test;

import academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.classebaseesobrescrita.dominio.Animal;
import academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.classebaseesobrescrita.dominio.Cachorro;
import academy.devdojo.maratonajava.exercicios.polimorfismo.fundamentos.classebaseesobrescrita.dominio.Gato;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.emitirSom();
        animal2.emitirSom();
    }
}