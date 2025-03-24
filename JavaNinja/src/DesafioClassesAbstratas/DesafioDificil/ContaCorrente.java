package DesafioClassesAbstratas.DesafioDificil;

public class ContaCorrente extends ContaBancaria{


    @Override
    public void sacar(double valor) {
        System.out.println("Sacando dinheiro conta corrente");
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando dinheiro conta corrente");
    }
}
