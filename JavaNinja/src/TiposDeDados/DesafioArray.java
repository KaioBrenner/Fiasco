package TiposDeDados;

import java.util.Arrays;

public class DesafioArray {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            double rand = Math.random() * 100;
            int numeroInt = (int) rand;
            System.out.println(numeroInt);
            numeros[i] = numeroInt;
        }


        System.out.println("Valores do Array: "+ Arrays.toString(numeros));

        int [] numerosOrdenados = Arrays.stream(numeros).sorted().toArray();

        System.out.println(Arrays.toString(numerosOrdenados));

        int arrLength = numerosOrdenados.length;

        System.out.println(arrLength);



    }
}
