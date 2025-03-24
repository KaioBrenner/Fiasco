package TiposDeDados;
import java.util.Scanner;

public class DesafioString {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva uma frase: \n");
        String text = ler.nextLine();

        System.out.println(text);

        String[] words = text.split(" ");

        int wordsCounter = words.length;

        System.out.println(wordsCounter);


        String textChanged = text.replace("a", "*").replace("e", "*").replace("i", "*").replace("o", "*").replace("u", "*");


        System.out.println(textChanged);
    }
}
