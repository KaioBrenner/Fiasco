package Desafio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ArrayList<String> nomesNinjas = new ArrayList<>();
        String[] nomesNinjas = new String[5];
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        System.out.println(nomesNinjas[0]);


        while(escolha != 3){
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar nome de ninja");
            System.out.println("2 - Exibir lista de todos os ninjas cadastrados");
            System.out.println("3 - Fecha aplicação");
            escolha = scanner.nextInt();
            scanner.nextLine();


            switch (escolha){
                case 1:
                    if(nomesNinjas[nomesNinjas.length - 1] !=null){
                        System.out.println("A lista já está cheia! Não é possível colocar mais ninjas!");
                        break;
                    }
                    String nomeNinja;
                    System.out.println("Insira o nome do ninja que deseja cadastrar:");
                    nomeNinja = scanner.nextLine();
                    for (int i = 0; i < nomesNinjas.length; i++) {
                        if(nomesNinjas[i] == null){
                            nomesNinjas[i] = nomeNinja;
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Exibindo lista de ninjas cadastrados:");
                    System.out.println(Arrays.toString(nomesNinjas));
                    break;
                case 3:
                    System.out.println("Sistema finalizando operações...");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }


        }

    }
}
