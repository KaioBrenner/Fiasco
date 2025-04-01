package Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(4142.32, TipoConta.CORRENTE);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(3512.73, TipoConta.POUPANCA);


        ContaCorrente contaCorrente2 = new ContaCorrente(2582.87, TipoConta.CORRENTE);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(6542, TipoConta.POUPANCA);

        BancoKonoha banco = new BancoKonoha();



        contaCorrente1.consultarSaldo();
        contaPoupanca1.consultarSaldo();
        contaCorrente2.consultarSaldo();
        contaPoupanca2.consultarSaldo();


        banco.transferirSaldo(contaCorrente1, contaPoupanca1);
        banco.transferirSaldo(contaPoupanca1, contaCorrente1);
        banco.transferirSaldo(contaCorrente1, contaCorrente2);
        banco.transferirSaldo(contaPoupanca1, contaPoupanca2);


        contaCorrente1.consultarSaldo();
        contaPoupanca1.consultarSaldo();
        contaCorrente2.consultarSaldo();
        contaPoupanca2.consultarSaldo();
    }
}
