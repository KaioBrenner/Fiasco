package NivelIntermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Uchiha[] ninjas = new Uchiha[5];
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        System.out.println(ninjas[0]);


        while(escolha != 4){
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Exibir lista de todos os ninjas cadastrados");
            System.out.println("3 - Atualizar habilidade especial");
            System.out.println("4 - Fecha aplicação");
            escolha = scanner.nextInt();
            scanner.nextLine();


            switch (escolha){
                case 1:
                    if(ninjas[ninjas.length - 1] !=null){
                        System.out.println("A lista já está cheia! Não é possível colocar mais ninjas!");
                        break;
                    }
                    Uchiha ninjaUchiha = new Uchiha();

                    String nome;
                    int idade;
                    String missao;
                    String nivelDificuldade;
                    String statusMissao;
                    String habilidadeEspecial;



                    System.out.println("Insira o nome do ninja:");
                    nome = scanner.nextLine();
                    System.out.println("Insira a idade do ninja:");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira a missão do ninja:");
                    missao = scanner.nextLine();
                    System.out.println("Insira o nível da dificuldade da missão do ninja:");
                    nivelDificuldade = scanner.nextLine();
                    System.out.println("Insira o status da missão ninja:");
                    statusMissao = scanner.nextLine();
                    System.out.println("Insira a habilidade especial:");
                    habilidadeEspecial = scanner.nextLine();

                    ninjaUchiha.nome = nome;
                    ninjaUchiha.idade = idade;
                    ninjaUchiha.missao = missao;
                    ninjaUchiha.nivelDificuldade = nivelDificuldade;
                    ninjaUchiha.statusMissao = statusMissao;
                    ninjaUchiha.habilidadeEspecial = habilidadeEspecial;

                    for (int i = 0; i < ninjas.length; i++) {
                        if(ninjas[i] == null){
                            ninjas[i] = ninjaUchiha;
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Exibindo lista de ninjas cadastrados:");

                    for (int i = 0; i < ninjas.length; i++) {
                        if(ninjas[i] != null){
                            System.out.println("Ninja " + (i + 1)+":");
                            ninjas[i].mostrarInformacoes();
                            System.out.println("-----------------------------");
                        }
                    }
                    break;
                case 3:
                    int ninjaEscolha;
                    String novaHabilidadeEspecial;
                    System.out.println("Qual ninja você deseja alterar a habilidade especial:");
                    for (int i = 0; i < ninjas.length; i++) {
                        if(ninjas[i] != null){
                            System.out.println((i + 1) + " - "+ ninjas[i].nome +" | "+ ninjas[i].habilidadeEspecial);
                        }
                    }

                    ninjaEscolha = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite a nova habilidade especial: ");
                    novaHabilidadeEspecial = scanner.nextLine();

                    ninjas[ninjaEscolha - 1].habilidadeEspecial = novaHabilidadeEspecial;

                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }


        }

    }
}
