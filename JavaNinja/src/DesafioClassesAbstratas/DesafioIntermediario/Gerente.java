package DesafioClassesAbstratas.DesafioIntermediario;

public class Gerente extends Funcionario{

    public Gerente() {
    }



    @Override
    public double calcularSalario() {
        return salarioBase + 500;
    }
}
