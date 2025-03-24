package DesafiosInterfaces.DesafioComplexo;

public class Gerente implements Funcionario{



    @Override
    public double calcularSalario(int salario) {
        return salario * 2 + 385 ;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}
