package DesafioSuperClasses;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }



    @Override
    public double calculcarSalario() {
        return salarioBase * 1.2;
    }
}
