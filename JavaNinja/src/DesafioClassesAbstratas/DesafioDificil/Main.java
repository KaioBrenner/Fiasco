package DesafioClassesAbstratas.DesafioDificil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("1 - Criar Conta Bancária");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Exibir saldo da conta");
        System.out.println("0 - Fechar aplicação");

        escolha = scanner.nextInt();
        scanner.nextLine();

        while(escolha != 0){
            switch (escolha){
                case 1:
                    System.out.println("Criando conta");
                    break;
                case 2:
                    System.out.println("depositando");
                    break;
                case 3:
                    System.out.println("Sacando");
                    break;
                case 4:
                    System.out.println("Exibindo");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor inválido, tente  novamente");
                    break;
            }



            System.out.println("Escolha uma opção");
            System.out.println("1 - Criar Conta Bancária");
            System.out.println("2 - Depositar dinheiro");
            System.out.println("3 - Sacar dinheiro");
            System.out.println("4 - Exibir saldo da conta");
            System.out.println("0 - Fechar aplicação");

            escolha = scanner.nextInt();
            scanner.nextLine();

        }



    }
}
