package academy.devdojo.maratonajava.exercicios.desafio.dominio;

public class Pix implements Pagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento Pix...");
    }
}