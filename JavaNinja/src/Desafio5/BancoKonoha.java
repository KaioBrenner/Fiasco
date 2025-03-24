package Desafio5;

import java.util.Scanner;

public class BancoKonoha {

    public void transferirSaldo(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor você deseja tranferir da Conta Corrente para a Conta Poupança?");
        System.out.println("Saldo da Conta Corrente: R$ "+ contaCorrente.saldo);
        double valorTransferencia = scanner.nextDouble();
        scanner.nextLine();

        if(valorTransferencia <= contaCorrente.saldo){
            contaCorrente.saldo -= valorTransferencia;
            contaPoupanca.saldo += valorTransferencia;
        }else{
            System.out.println("O valor precisa ser menor ou igual ao saldo da Conta que transfere o valor. Tente novamente");
        }

    };

    public void transferirSaldo(ContaPoupanca contaPoupanca, ContaCorrente contaCorrente){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor você deseja tranferir da Conta Poupança para a Conta Corrente?");
        System.out.println("Saldo da Conta Poupança: R$ "+ contaCorrente.saldo);
        double valorTransferencia = scanner.nextDouble();
        scanner.nextLine();

        if(valorTransferencia <= contaPoupanca.saldo){
            contaPoupanca.saldo -= valorTransferencia;
            contaCorrente.saldo += valorTransferencia;
        }else{
            System.out.println("O valor precisa ser menor ou igual ao saldo da Conta que transfere o valor. Tente novamente");
        }

    };

    public void transferirSaldo(ContaCorrente contaCorrente1, ContaCorrente contaCorrente2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor você deseja tranferir da primeira Conta Corrente para a segunda Conta Corrente?");
        System.out.println("Saldo da Conta Corrente: R$ "+ contaCorrente1.saldo);
        double valorTransferencia = scanner.nextDouble();
        scanner.nextLine();

        if(valorTransferencia <= contaCorrente1.saldo){
            contaCorrente1.saldo -= valorTransferencia;
            contaCorrente2.saldo += valorTransferencia;
        }else{
            System.out.println("O valor precisa ser menor ou igual ao saldo da Conta que transfere o valor. Tente novamente");
        }

    };

    public void transferirSaldo(ContaPoupanca contaPoupanca1, ContaPoupanca contaPoupanca2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor você deseja tranferir da primeira Conta Poupança para a segunda Conta Poupança?");
        System.out.println("Saldo da Conta Corrente: R$ "+ contaPoupanca1.saldo);
        double valorTransferencia = scanner.nextDouble();
        scanner.nextLine();

        if(valorTransferencia <= contaPoupanca1.saldo){
            contaPoupanca1.saldo -= valorTransferencia;
            contaPoupanca2.saldo += valorTransferencia;
        }else{
            System.out.println("O valor precisa ser menor ou igual ao saldo da Conta que transfere o valor. Tente novamente");
        }

    };

}
