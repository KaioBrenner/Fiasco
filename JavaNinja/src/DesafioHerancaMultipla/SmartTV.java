package DesafioHerancaMultipla;

public class SmartTV extends Dispositivo implements Conectavel, ControlavelRemotamente{

    @Override
    public void conectarInternet() {
        System.out.println("Conectando a internet...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Smart TV");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Smart TV");
    }
}
