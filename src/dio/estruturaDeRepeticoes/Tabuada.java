package dio.estruturaDeRepeticoes;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        int multiplicacao;

        System.out.println("Escolha a tabuada de  1 á 10? ");
        tabuada = scan.nextInt();

        while (tabuada < 1 | tabuada > 10){

            System.out.println("Numero Invalido! Tente Novamente! \nEscolha a tabuada de  1 á 10? ");
            tabuada = scan.nextInt();

        }

        //tabuada com for

        System.out.println("Tabuada do " +  tabuada + ": ");
        for (int i = 1; i <= 10; i++){
            multiplicacao = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + multiplicacao);
        }

        //tabuada com do while

        int count1 = 1;
        System.out.println("\nTabuada do " +  tabuada + ": ");
        do{
            multiplicacao = tabuada * count1;
            System.out.println(tabuada + " x " + count1 + " = " + multiplicacao);
            count1++;
        }while (count1 <= 10);


        //tabuada com while

        int count2 = 0;
        System.out.println("\nTabuada do " +  tabuada + ": ");
        while (count2 <= 10){
            multiplicacao = tabuada * count2;
            System.out.println(tabuada + " x " + count2 + " = " + multiplicacao);
            count2++;
        };


    }
}
