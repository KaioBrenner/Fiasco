package Desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> listaNinjas = new LinkedList<>();

        listaNinjas.add(new Ninja("Kakashi", 30, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Madara", 57, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Naruto", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Sasuke", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Sakura", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Gaara", 17, "Aldeia da Areia"));
        listaNinjas.add(new Ninja("Killer Bee", 25, "Aldeia da Nuvem"));
        listaNinjas.add(new Ninja("Itachi", 21, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Minato", 24, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Tsunade", 50, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Orochimaru", 54, "Aldeia do Som"));
        listaNinjas.add(new Ninja("Jiraiya", 54, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Shikamaru", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Ino", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Choji", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Neji", 18, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Rock Lee", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("TenTen", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Hinata", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Kiba", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Shino", 17, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Konohamaru", 12, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Obito", 30, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Rin", 16, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Yamato", 28, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Danzou", 72, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Zabuza", 26, "Aldeia da Névoa"));
        listaNinjas.add(new Ninja("Haku", 15, "Aldeia da Névoa"));
        listaNinjas.add(new Ninja("Kisame", 32, "Aldeia da Névoa"));
        listaNinjas.add(new Ninja("Deidara", 19, "Aldeia da Pedra"));
        listaNinjas.add(new Ninja("Sasori", 35, "Aldeia da Areia"));
        listaNinjas.add(new Ninja("Pain", 35, "Aldeia da Chuva"));
        listaNinjas.add(new Ninja("Konan", 35, "Aldeia da Chuva"));
        listaNinjas.add(new Ninja("Kabuto", 30, "Aldeia do Som"));
        listaNinjas.add(new Ninja("Hiruzen", 69, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Asuma", 31, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Kurenai", 30, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Mei Terumi", 31, "Aldeia da Névoa"));
        listaNinjas.add(new Ninja("Raikage A", 45, "Aldeia da Nuvem"));
        listaNinjas.add(new Ninja("Onoki", 79, "Aldeia da Pedra"));
        listaNinjas.add(new Ninja("Chiyo", 72, "Aldeia da Areia"));
        listaNinjas.add(new Ninja("Hanzo", 60, "Aldeia da Chuva"));
        listaNinjas.add(new Ninja("Kaguya", 1000, "Dimensão Paralela"));
        listaNinjas.add(new Ninja("Momoshiki", 500, "Clã Otsutsuki"));
        listaNinjas.add(new Ninja("Kinshiki", 500, "Clã Otsutsuki"));
        listaNinjas.add(new Ninja("Shisui", 20, "Aldeia da Folha"));
        listaNinjas.add(new Ninja("Guren", 28, "Aldeia do Som"));


        System.out.println(listaNinjas);

        listaNinjas.removeFirst();



        System.out.println(listaNinjas);
        listaNinjas.addFirst(new Ninja("Nagato", 35, "Aldeia da Chuva"));
        System.out.println(listaNinjas);


        System.out.println("Iteração");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma forma de ordenar os Ninjas.");
        System.out.println("1 - Ordenar por nome");
        System.out.println("2 - Ordenar por idade");
        System.out.println("3 - Ordenar por vila");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha){
            case 1:

                System.out.println("--------------- Ordenando por nome ----------------");
                listaNinjas.sort(Comparator.comparing(ninja -> ninja.nome));
                for (int i = 0; i < listaNinjas.size(); i++) {
                    System.out.println(listaNinjas.get(i).toString());
                }
                break;
            case 2:

                System.out.println("--------------- Ordenando por idade ----------------");
                listaNinjas.sort(Comparator.comparing(ninja -> ninja.idade));
                for (int i = 0; i < listaNinjas.size(); i++) {
                    System.out.println(listaNinjas.get(i));
                }
                break;
            case 3:

                System.out.println("--------------- Ordenando por vila ----------------");
                listaNinjas.sort(Comparator.comparing(ninja -> ninja.vila));
                for (int i = 0; i < listaNinjas.size(); i++) {
                    System.out.println(listaNinjas.get(i));
                }
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }


        listaNinjas.sort(Comparator.comparing(ninja -> ninja.nome));


        System.out.println("Pesquise o nome de algum Ninja");
        String nomePesquisa = scanner.nextLine();



        int esquerda = 0;
        int direita = listaNinjas.size() - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            int comparacao = listaNinjas.get(meio).nome.compareToIgnoreCase(nomePesquisa);

            if (comparacao == 0) {
                System.out.println("O Ninja que você buscou com busca binária é esse");
                System.out.println(listaNinjas.get(meio));
                break;
            } else if (comparacao < 0) {
                esquerda = meio + 1; // Buscar na metade direita
            } else {
                direita = meio - 1; // Buscar na metade esquerda
            }
        }


//        boolean ninjaFound = false;
//        for (int i = 0; i < listaNinjas.size(); i++) {
//            if (nomePesquisa.equals(listaNinjas.get(i).nome)) {
//                System.out.println(listaNinjas.get(i));
//                ninjaFound = true;
//            }
//        }
//
//        if(!ninjaFound){
//            System.out.println("O ninja não foi encontrado.");
//        }


    }
}
