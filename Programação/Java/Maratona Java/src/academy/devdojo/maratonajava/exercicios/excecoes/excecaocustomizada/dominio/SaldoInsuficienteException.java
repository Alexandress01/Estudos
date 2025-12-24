package academy.devdojo.maratonajava.exercicios.excecoes.excecaocustomizada.dominio;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente: valor de saque excedente");
    }

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}