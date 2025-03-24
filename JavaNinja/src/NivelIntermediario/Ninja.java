package NivelIntermediario;



public abstract class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Meu nome é: "+ nome);
        System.out.println("Minha idade é: "+ idade);
        System.out.println("Minha missão é: "+ missao);
        System.out.println("O nível de dificuldade da missão é: "+ nivelDificuldade);
        System.out.println("O status da missão é: "+ statusMissao);
    }


}
