package DesafioSuperClasses;

public class Main {
    public static void main(String[] args) {

        Gerente funcionario1 = new Gerente("Kaio", 2000);

        double salario1 = funcionario1.calculcarSalario();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Kaio", 3000);

        double salarioDev = desenvolvedor.calculcarSalario();

        System.out.println(salarioDev);


        System.out.println(salario1);
    }
}
