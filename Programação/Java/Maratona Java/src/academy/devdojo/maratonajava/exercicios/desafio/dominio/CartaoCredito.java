package academy.devdojo.maratonajava.exercicios.desafio.dominio;

public class CartaoCredito implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento no Cartão de Crédito...");
    }
}