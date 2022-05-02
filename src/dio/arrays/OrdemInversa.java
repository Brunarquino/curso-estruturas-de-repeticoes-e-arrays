package dio.arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        //Arrays Unidimensionais

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        int count = 0;
        while (count < (vetor.length)){

            System.out.println(vetor[count]);
            count++;

        };


        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i]);
        }

    }
}
