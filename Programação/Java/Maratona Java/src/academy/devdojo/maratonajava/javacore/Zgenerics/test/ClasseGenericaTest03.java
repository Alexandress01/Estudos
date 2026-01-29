package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentalService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);

        Carro carro = carroRentalService.buscarObjetoDisponivel();

        System.out.println("Usando o carro por um mês...");
        carroRentalService.devolverObjetoAlugado(carro);

        System.out.println("--------------------------------");

        Barco barco = barcoRentalService.buscarObjetoDisponivel();

        System.out.println("Usando o barco por um mês...");
        barcoRentalService.devolverObjetoAlugado(barco);
    }
}