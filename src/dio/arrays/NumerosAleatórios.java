package dio.arrays;

import java.util.Random;

public class NumerosAleatórios {
    public static void main(String[] args) {

        //Classe que gera números Aléatorios
        Random radom = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = radom.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.println("Números Aleatorios: ");
        for (int numero: numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores do números Aléatorios: ");
        for (int numero: numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }

        System.out.println("Antecessores do números Aléatorios: ");
        for (int numero: numerosAleatorios) {
            System.out.println((numero-1) + " ");
        }
    }
}
