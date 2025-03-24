package DesafioHerancaMultipla;

public class Main {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        smartTV.modelo = "AISN20NZ";
        smartTV.marca = "LG";

        smartTV.exibirInformacoes();

        smartTV.ligar();
        smartTV.conectarInternet();
        smartTV.desligar();

    }
}
