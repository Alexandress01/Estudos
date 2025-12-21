package academy.devdojo.maratonajava.exercicios.desafio.dominio;

public class Boleto implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento no Boleto...");
    }
}