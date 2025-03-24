package DesafioClassesAbstratas.DesafioDificil;

public abstract class ContaBancaria {

    String titular;
    double saldo;

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    public void exibirSaldo(){
        System.out.println("Saldo: ");
    };

}
