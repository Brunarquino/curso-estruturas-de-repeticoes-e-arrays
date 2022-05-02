package dio.estruturaDeRepeticoes;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        //Fluxo de entrada atráves do teclado
        //para ler
        Scanner scan = new Scanner(System.in);

        //Pedir dois valores
        String nome;
        int idade;

        // while - Enquanto
        //o progrma só finaliza quando o usuario digitar 0 no nome
        while (true) {
            //lendo dois valores que o usuario vai colocar
            System.out.println("Nome: ");
           nome = scan.next();
           if (nome.equals("0")) break; // quando a variavel nome for igual a zero o programa para
           System.out.println("Idade: ");
           idade = scan.nextInt();
        }

        System.out.println("Continua aqui..."); // o códigos é executado depois do fim do loop

    }
}
