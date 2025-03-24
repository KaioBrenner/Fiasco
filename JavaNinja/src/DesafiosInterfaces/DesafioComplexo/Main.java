package DesafiosInterfaces.DesafioComplexo;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        Estagiario estagiario = new Estagiario();

        System.out.println(gerente.calcularSalario(2000));
        System.out.println(desenvolvedor.calcularSalario(2000));
        System.out.println(estagiario.calcularSalario(2000));

    }
}
