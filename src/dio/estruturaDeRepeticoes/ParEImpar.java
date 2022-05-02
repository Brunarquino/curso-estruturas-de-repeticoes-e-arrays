package dio.estruturaDeRepeticoes;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        // pede quantos numeros quer colocar
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            //pede os números
            System.out.println("Número: ");
            numero = scan.nextInt();

            // se o resto da divisão for igual a zero numero é par
            if(numero % 2 == 0){
                quantPares++;
            }else{ //se não é impar
                quantImpares++;
            }
            count++;

        }while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("quantidade Imapar: " + quantImpares);


    }
}
