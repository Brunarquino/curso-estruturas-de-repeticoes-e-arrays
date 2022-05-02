package dio.arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        //Array multidimensional
        int[][] M = new int[4][4];

        //linhas
        for(int i = 0; i < M.length; i++) {
            //Colunas
            for( int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");

        for (int[] linha : M) {
            for (int coluna : linha){
                System.out.println(coluna + " ");
            }
        }
    }
}
