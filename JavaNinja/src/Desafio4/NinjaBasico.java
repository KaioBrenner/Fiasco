package Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    Enum habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, Enum habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Sou um ninja básico:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        if (habilidade != null) {
            System.out.println("Minha habilidade é: " + habilidade);
        }
    }
}
