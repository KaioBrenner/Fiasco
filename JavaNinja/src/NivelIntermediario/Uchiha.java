package NivelIntermediario;



public class Uchiha extends  Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Meu nome é "+ nome+ " e minha habilidade especial é " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é: "+ nome);
        System.out.println("Minha idade é: "+ idade);
        System.out.println("Minha missão é: "+ missao);
        System.out.println("O nível de dificuldade da missão é: "+ nivelDificuldade);
        System.out.println("O status da missão é: "+ statusMissao);
        System.out.println("Meu nome é "+ nome+ " e minha habilidade especial é " + habilidadeEspecial);
    }
}
