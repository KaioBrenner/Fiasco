package DesafioClassesAbstratas.DesafioIntermediario;

public class Desenvolvedor  extends Funcionario{

    Enum experiencia;

    public Desenvolvedor(Enum experiencia) {
        this.experiencia = experiencia;
    }

    public Desenvolvedor() {
    }

    @Override
    public double calcularSalario() {
        double multiplicador = 0;

        if (experiencia.equals(Experiencia.JUNIOR)) {
            multiplicador =  salarioBase * 1.10;
        } else if (experiencia.equals(Experiencia.PLENO)) {
            multiplicador = salarioBase * 1.20;
        } else if (experiencia.equals(Experiencia.SENIOR)) {
            multiplicador = salarioBase * 1.30;
        }
        
        return multiplicador;
    }
}
