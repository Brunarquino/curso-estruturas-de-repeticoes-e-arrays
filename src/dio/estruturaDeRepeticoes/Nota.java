package dio.estruturaDeRepeticoes;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        //pedindo a nota entre 10 e 0
        System.out.println("Digite uma nota de 0 á 10: ");
        nota = scan.nextInt();

        // se a nota for invalida ela entrao loop até o usuario digitar uma nota válida
        while (nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt(); //se a nota inserida não for entre 0 e 10 fica no loop
        }

    }
}
