import java.util.ArrayList;
import java.util.List;

public class Desafio01 {

    public static void main(String[] args) throws Exception {

        //Iniciando variáveis
        int num01 = 5;
        int num02 = 20;
        List<Integer> listPares = new ArrayList<>();

        //Chamando a função
        listPares = getPares(num01, num02);

        //Imprimindo o resultado
        System.out.println(listPares);
    }

    //Criando a função
    public static List<Integer> getPares(int num1, int num2) {
        //Iniciando variáveis
        List<Integer> numPares = new ArrayList<>();
        
        /*
         * Para cada i (com i iniciando em num1 e terminando em num2), teste se o resultado da 
         * divisão de i por 2 e 0, se sim é par
         */
        for (int i = num1; i <= num2; i = i +1) {
            if (i % 2 == 0) {
                numPares.add(i);
            }
        }
        //Retorna o resultado
        return numPares;
    }
}
