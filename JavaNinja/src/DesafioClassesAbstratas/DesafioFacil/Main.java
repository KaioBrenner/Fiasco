package DesafioClassesAbstratas.DesafioFacil;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(3.5,2);

        double retanguloArea = retangulo.calcularArea();
        System.out.println(retanguloArea);


        Circulo circulo = new Circulo(3);
        double circuloArea = circulo.calcularArea();
        System.out.println(circuloArea);
    }
}
