package DesafioClassesAbstratas.DesafioIntermediario;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente();
        Funcionario desenvolvedor = new Desenvolvedor(Experiencia.PLENO);

        System.out.println(gerente.calcularSalario());

        System.out.println(desenvolvedor.calcularSalario());




    }
}
