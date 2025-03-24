package Desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;

    Enum TipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, Enum tipoConta) {
        this.saldo = saldo;
        TipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        if(TipoConta == Desafio5.TipoConta.CORRENTE){
            System.out.println("O saldo da conta corrente é R$"+ saldo);
        }else{
            System.out.println("O saldo da conta poupança é R$"+ saldo);
        }
    }
}
