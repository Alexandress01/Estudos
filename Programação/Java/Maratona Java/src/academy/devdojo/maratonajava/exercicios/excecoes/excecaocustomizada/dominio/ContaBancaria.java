package academy.devdojo.maratonajava.exercicios.excecoes.excecaocustomizada.dominio;

public class ContaBancaria {
    private double saldo = 2000;

    public double sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        } else if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: " + saldo + ", saque solicitado: " + valor);
        }
        saldo -= valor;
        return saldo;
    }
}