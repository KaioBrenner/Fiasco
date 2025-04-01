package FinalMethods;

public class Animal {

    String nome;
    private int idade;
    private double peso;
    private double alturaM;

    private double calcularImc(double peso, double altura){
        return peso / (altura * altura);
    }

    public double getImc(){
        return calcularImc(this.peso, this.alturaM);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlturaM() {
        return alturaM;
    }

    public void setAlturaM(double alturaM) {
        this.alturaM = alturaM;
    }
}
