package academy.devdojo.maratonajava.exercicios.desafio.test;

import academy.devdojo.maratonajava.exercicios.desafio.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class PagamentoTest {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new Pix());
        pagamentos.add(new CartaoCredito());
        pagamentos.add(new Boleto());

        for (Pagamento pagamento : pagamentos) {
            Caixa.pagar(pagamento);
        }
    }
}