package Condicoes;

import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        String nomeNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: "+nomeNinja);



        caixaDeTexto.close();
    }


}
