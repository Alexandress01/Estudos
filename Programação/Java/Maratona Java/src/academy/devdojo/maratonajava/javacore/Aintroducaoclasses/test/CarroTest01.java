package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Rolls-Royce";
        carro1.modelo = "Spectre";
        carro1.ano = 2022;

        carro2.nome = "Bugatti";
        carro2.modelo = "Tourbillon";
        carro2.ano = 2026;

        carro1 = carro2;

        System.out.println("Carro: " + carro1.nome);
        System.out.println("Modelo do Carro: " + carro1.modelo);
        System.out.println("Ano do Carro: " + carro1.ano);

        System.out.println("---------------------------------");

        System.out.println("Carro 2: " + carro2.nome);
        System.out.println("Modelo do Carro 2: " + carro2.modelo);
        System.out.println("Ano do Carro 2: " + carro2.ano);
    }
}
