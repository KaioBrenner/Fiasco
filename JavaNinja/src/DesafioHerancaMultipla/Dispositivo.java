package DesafioHerancaMultipla;

public abstract class Dispositivo {

    String marca;
    String modelo;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Dispositivo() {
    }

    public void exibirInformacoes(){
        System.out.println("Exibindo info");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }

}
