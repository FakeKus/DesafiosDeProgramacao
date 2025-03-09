import java.util.ArrayList;
import java.util.List;

public class Desafio01 {

    private static List<Integer> numPares = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        
        /*
         * Receber um range de números inteiros e imprimir todos os números pares
         */

        int num01 = 5;
        int num02 = 20;

        getPares(num01, num02);

        System.out.println(numPares);
    }

    public static List<Integer> getPares(int num1, int num2) {
        for (int i = num1; i <= num2; i = i +1) {
            if (i % 2 == 0) {
                numPares.add(i);
            }
        }
        return numPares;
    }
}
