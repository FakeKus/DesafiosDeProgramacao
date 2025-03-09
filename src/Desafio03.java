public class Desafio03 {
    public static void main(String[] args) {

        String str01 = "Olha lá o galo cego";
        String str02 = "lá o galo ";

        System.out.println(removeString(str01, str02));

    }

    public static String removeString(String str1, String str2) {
        
        return str1.replace(str2, "");
    }
}
