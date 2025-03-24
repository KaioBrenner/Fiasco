package Desafio1;

public class Saguao {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja();
        ninja1.nome = "Naruto";
        ninja1.idade = 14;
        ninja1.missao = new Missao();
        ninja1.missao.nome = "Caçar Gato da dona florinda";
        ninja1.missao.concluida = false;
        ninja1.missao.dificuldade = 'D';

        Ninja ninja2 = new Ninja();
        ninja2.nome = "Sasuke";
        ninja2.idade = 14;
        ninja2.missao = new Missao();
        ninja2.missao.nome = "Ir Atrás do Itachi";
        ninja2.missao.concluida = false;
        ninja2.missao.dificuldade = 'B';

        Ninja ninja3 = new Ninja();
        ninja3.nome = "Tsunade";
        ninja3.idade = 50;
        ninja3.missao = new Missao();
        ninja3.missao.nome = "Curar 100 crianças com vício em Tik Tok";
        ninja3.missao.concluida = false;
        ninja3.missao.dificuldade = 'S';

        if(ninja1.idade < 15){
            if(ninja1.missao.dificuldade == 'C' || ninja1.missao.dificuldade == 'D' ){
                ninja1.missao.concluida = true;
            }
        }else{
            ninja1.missao.concluida = true;
        }

        if(ninja2.idade < 15){
            if(ninja2.missao.dificuldade == 'C' || ninja2.missao.dificuldade == 'D' ){
                ninja2.missao.concluida = true;
            }
        }else{
            ninja1.missao.concluida = true;
        }

        if(ninja3.idade < 15){
            if(ninja3.missao.dificuldade == 'C' || ninja3.missao.dificuldade == 'D' ){
                ninja3.missao.concluida = true;
            }
        }else{
            ninja3.missao.concluida = true;
        }


        System.out.println("Olá, Senhora Hokage. Sou "+ ninja1.nome+ " tenho "+ ninja1.idade + " anos de idade. Minha" +
                " missão é "+ ninja1.missao.nome+ ", o rank dela é "+ ninja1.missao.dificuldade + " e " +
                ""+ (ninja1.missao.concluida ? "a missão já foi concluída" : "a missão não foi concluída ainda."));

        System.out.println("Olá, Senhora Hokage. Sou "+ ninja2.nome+ " tenho "+ ninja2.idade + " anos de idade. Minha" +
                " missão é "+ ninja2.missao.nome+ ", o rank dela é "+ ninja2.missao.dificuldade + " e " +
                ""+ (ninja2.missao.concluida ? "a missão já foi concluída" : "a missão não foi concluída ainda."));

        System.out.println("Olá, Senhora Hokage. Sou "+ ninja3.nome+ " tenho "+ ninja3.idade + " anos de idade. Minha" +
                " missão é "+ ninja3.missao.nome+ ", o rank dela é "+ ninja3.missao.dificuldade + " e " +
                ""+ (ninja3.missao.concluida ? "a missão já foi concluída" : "a missão não foi concluída ainda."));

    }
}
