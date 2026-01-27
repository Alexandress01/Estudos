package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando doguinho...");
    }
}

class PorquinhoDaIndia extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando porquinho...");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        PorquinhoDaIndia[] porquinhos = {new PorquinhoDaIndia(), new PorquinhoDaIndia()};

        printConsulta(cachorros);
        printConsulta(porquinhos);
        Animal[] animals = {new PorquinhoDaIndia(), new Cachorro()};
        printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

//        animals[1] = new PorquinhoDaIndia();
    }
}
