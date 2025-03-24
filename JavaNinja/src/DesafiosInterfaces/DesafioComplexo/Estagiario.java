package DesafiosInterfaces.DesafioComplexo;

public class Estagiario implements Funcionario{

    @Override
    public double calcularSalario(int salario) {
        return salario * 0.7;
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }


}
