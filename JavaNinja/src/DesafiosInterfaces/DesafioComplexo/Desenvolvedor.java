package DesafiosInterfaces.DesafioComplexo;

public class Desenvolvedor implements Funcionario{

    @Override
    public double calcularSalario(int salario) {
        return salario;
    }

    @Override
    public String getCargo() {
        return "Desenvolvedor";
    }

}
