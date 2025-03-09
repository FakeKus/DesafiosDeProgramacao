public class Desafio05 {
    public static void main(String[] args) {

        //Iniciando variáveis
        String temp = "23:59:59";   //hh:mm:ss

        //Imprimindo resultado
        System.out.println(Integer.toString(secs(temp)));
        
    }

    //Criando a função
    public static int secs(String temp) {

        //Pegando o valor númerico dos dois primeiros carácteres
        int mainHoras = (Character.getNumericValue(Character.valueOf(temp.charAt(0))) * 10) 
            + Character.getNumericValue(Character.valueOf(temp.charAt(1)));
        //Pegando o valor númerico dos carácteres 3 e 4
        int mainMinutes = (Character.getNumericValue(Character.valueOf(temp.charAt(3))) * 10) 
            + Character.getNumericValue(Character.valueOf(temp.charAt(4)));
        //Pegando o valor númerico dos carácteres 6 e 7
        int mainSeconds = (Character.getNumericValue(Character.valueOf(temp.charAt(6))) * 10) 
            + Character.getNumericValue(Character.valueOf(temp.charAt(7)));

        /*
         * Para transformar hh:mm:ss em segundos -> ((((hh * 60) + mm) * 60) + ss)
         */

        //Somando os minutos com horas multiplicado por 60
        mainMinutes = mainMinutes + (mainHoras * 60);
        //Somando os segundos com minutos multiplicados por 60
        mainSeconds = mainSeconds + (mainMinutes * 60);

        return mainSeconds;
    }
}
