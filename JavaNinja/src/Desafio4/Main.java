package Desafio4;

public class Main {
    public static void main(String[] args) {
        Ninja ninja1 = new NinjaBasico("nome",12, TipoHabilidade.TAIJUTSU);


        Ninja ninja2 = new NinjaAvancado("nome",12, TipoHabilidade.NINJUTSU, "Jutsu bola de fogo");

        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();

        System.out.println("------------------------------------------");

        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();

    }
}
