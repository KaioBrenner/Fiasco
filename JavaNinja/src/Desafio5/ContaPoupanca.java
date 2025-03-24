package Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo, Enum tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor * 0.99;
    }
}
