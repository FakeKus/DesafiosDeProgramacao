public class Desafio05 {
    public static void main(String[] args) {

        String temp = "23:59:59";

        System.out.println(Integer.toString(secs(temp)));
        
    }

    public static int secs(String temp) {

        int mainHoras = (Character.getNumericValue(Character.valueOf(temp.charAt(0))) * 10) 
            + Character.getNumericValue(Character.valueOf(temp.charAt(1)));
        int mainMinutes = (Character.getNumericValue(Character.valueOf(temp.charAt(3))) * 10) 
            + Character.getNumericValue(Character.valueOf(temp.charAt(4)));
        int mainSeconds = (Character.getNumericValue(Character.valueOf(temp.charAt(6))) * 10) 
            + Character.getNumericValue(Character.valueOf(temp.charAt(7)));

        mainMinutes = mainMinutes + (mainHoras * 60);
        mainSeconds = mainSeconds + (mainMinutes * 60);

        return mainSeconds;
    }
}
