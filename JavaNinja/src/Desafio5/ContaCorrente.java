package Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, Enum tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
