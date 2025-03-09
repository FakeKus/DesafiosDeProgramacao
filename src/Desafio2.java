import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, Boolean> chairMap = new HashMap<>();
        for (int i = 0; i <= 100; i = i + 1) {
            chairMap.put(i, (new Random().nextInt(2) == 1));
        }

        printChair(chairMap);

        System.out.print("\n\nEscolha seu assento: ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (chairMap.get(choice)) {
            System.out.println("Assento já reservado!");
        } else {
            System.out.println("Assento reservado com sucesso!");
        }
        scanner.close();
                
    }
        
    public static void printChair(Map<Integer, Boolean> chairMap) {
        int aux = 0;
        for (Map.Entry<Integer, Boolean> chair : chairMap.entrySet()) {
            if (aux <= 4) {
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
