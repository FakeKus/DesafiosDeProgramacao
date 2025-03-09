public class Desafio03 {
    public static void main(String[] args) {

        //Iniciando variáveis
        String str01 = "Olha lá o galo cego";
        String str02 = "lá o galo ";

        //Imprimindo resultado
        System.out.println(removeString(str01, str02));

    }

    //Criando a função
    public static String removeString(String str1, String str2) {
        
        //removendo com String.replace
        return str1.replace(str2, "");
    }
}
