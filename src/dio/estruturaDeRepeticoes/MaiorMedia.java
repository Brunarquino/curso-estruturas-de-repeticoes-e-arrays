package dio.estruturaDeRepeticoes;

import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        String todosNumeros = "";
        int media = 0;

        int count = 0;

        do {
            //Pedir o numero 5 vezes
            System.out.println("Número: ");
            numero = scan.nextInt();

            //Montando uma string com todos números
            todosNumeros += numero;
            if(count < 4) {
                todosNumeros += " + ";
            }
            count++;

            // Motando a media
            media += numero;
            if(count == 5) {
                media = media/5;
            }
            // Se o numero atual for maior que o numero de maior, o numnero se torna o maor numero
            if(numero > maior) maior = numero;

            System.out.println("Maior Número Atual: " + maior);
        }while (count < 5);


        System.out.println("Maior Número Final: " + maior);

        System.out.println("Média dos números " + todosNumeros + " é " + media);

    }

}
