package academy.devdojo.maratonajava.exercicios.desafio.dominio;

public class Caixa {
    public static void pagar(Pagamento pagamento) {
        pagamento.processar();
    }
}