package dio.estruturaDeRepeticoes;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        //Programa que calcula o Fatorial de um número inteiro fornecido pelo usúario
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");
        for(int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao);

    }
}
