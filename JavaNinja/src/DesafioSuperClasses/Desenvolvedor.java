package DesafioSuperClasses;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calculcarSalario() {
        return salarioBase * 1.1;
    }
}
