package Desafio4;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    Enum habilidade;
    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, Enum habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Sou um ninja avançado:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: "+especialidade);
    }

    @Override
    public void executarHabilidade() {
        if(habilidade != null){
            System.out.println("Minha habilidade é: "+  habilidade);
        }
    }
}
