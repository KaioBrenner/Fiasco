package DesafioClassesAbstratas.DesafioFacil;

public class Circulo extends FiguraGeometrica{

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
