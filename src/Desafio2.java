import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        //Iniciando Variáveis
        Scanner scanner = new Scanner(System.in);           //Scanner para ler inputs
        Map<Integer, Boolean> chairMap = new HashMap<>();   //Map com número do assento(Integer) e disponibilidade(Boolean)
        int numChair = 100;                                 //Número total de assentos
        int choice;                                         //Escolha do "Cliente"

        //Gerando os assentos
        for (int i = 1; i <= numChair; i = i + 1) {
            chairMap.put(i, (new Random().nextInt(2) == 1));
        }

        //Listando as assentos no Terminal
        printChair(chairMap);

        //Pedindo e aguardando a escolha do "Cliente"
        System.out.print("\n\nEscolha seu assento: ");
        choice = Integer.parseInt(scanner.nextLine());
        scanner.close();

        //Imprimindo resultado
        System.out.println(checkChair(chairMap, choice));                
    }

    //Criando a função para checar a escolha do "Cliente"
    public static String checkChair(Map<Integer, Boolean> chairMap, int num01) {
        /*
         * Checando se a escolha do "Cliente" é True ou False
         * Se True, então a cadeira já está reservada
         * Se False, então a cadeira está livre
         */
        if (chairMap.get(num01)) {
            return("Assento já reservado!");
        } else {
            return("Assento reservado com sucesso!");
        }
    }
        
    //Criando a função para imprimir o Map
    public static void printChair(Map<Integer, Boolean> chairMap) {
        //Iniciando variáveis
        int aux = 0;    //Variável auxiliar para quebrar uma linha a cada 5 assentos

        /*
         * Para cada chair em chairMap
         * Se aux for menos que 4 imprime o próximo assento e incrementa 1 em aux
         * Se aux for maior que 4 imprime o próximo assento, quebra de linha e aux retorna para 0
         */
        for (Map.Entry<Integer, Boolean> chair : chairMap.entrySet()) {
            if (aux < 4) {
                System.out.print("Num: " + chair.getKey() + " : ");
                if (chair.getValue()) {
                    System.out.print("Reservada" + "\t");
                } else {
                    System.out.print("Livre" + "\t\t");
                }
                aux = aux + 1;
            } else {
                aux = 0;
                System.out.print("Num: " + chair.getKey() + " : ");
                if (chair.getValue()) {
                    System.out.println("Reservada" + "\t");
                } else {
                    System.out.println("Livre" + "\t\t");
                }
            }
        }
    }
}
