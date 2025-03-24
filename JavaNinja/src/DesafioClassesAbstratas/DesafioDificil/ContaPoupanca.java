package DesafioClassesAbstratas.DesafioDificil;

public class ContaPoupanca extends ContaBancaria{


    @Override
    public void sacar(double valor) {
        System.out.println("Sacando dinheiro conta poupança");
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando dinheiro conta poupança");
    }
}
