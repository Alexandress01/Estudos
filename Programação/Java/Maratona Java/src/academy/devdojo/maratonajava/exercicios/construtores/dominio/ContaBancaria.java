package academy.devdojo.maratonajava.exercicios.construtores.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 50;
        System.out.println("----- Conta Bancária -----");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo Inicial: R$ " + this.saldo);
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("----- Depósito -----");
        System.out.println("Saldo Atual: R$ " + this.saldo);
    }

    public void sacar(double saque) {
        if (this.saldo < saque) {
            System.out.println("----- Saque Falho! -----");
            System.out.println("Saldo indisponível para saque!");
            return;
        } else {
            this.saldo -= saque;
            System.out.println("----- Saque -----");
            System.out.println("Saldo Atual: R$ " + this.saldo);
        }
    }
}