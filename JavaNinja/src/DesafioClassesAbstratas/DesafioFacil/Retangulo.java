package DesafioClassesAbstratas.DesafioFacil;

public class Retangulo extends FiguraGeometrica{

    double altura;
    double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo() {
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
