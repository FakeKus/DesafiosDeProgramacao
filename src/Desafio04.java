import java.util.ArrayList;
import java.util.List;

public class Desafio04 {
    public static void main(String[] args) {

        /*
         * 
         * TO DO
         * Comentários 
         * 
         */

        int num01 = 8553;
        System.out.println(ordenNum(num01).toString());
        
    }

    public static List<Integer> ordenNum(int num1) {
        
        List<Integer> nums = new ArrayList<>();
        for (char ch : String.valueOf(num1).toCharArray()) {
            if (nums.isEmpty()) {
                nums.add(Character.getNumericValue(ch));
            } else {
                for (int i = 0; i < nums.size(); i = i + 1) {
                    if (Character.getNumericValue(ch) >= nums.get(i)) {
                        nums.add(i + 1, Character.getNumericValue(ch));
                        break;
                    } else {
                        nums.add(i, Character.getNumericValue(ch));
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
