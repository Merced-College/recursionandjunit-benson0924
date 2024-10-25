package Question5;

public class Question5{

    public static String stringClean(String str) {

        if (str.length() <= 1) {
            return str;
        }
        

        if (Character.toLowerCase(str.charAt(0)) == Character.toLowerCase(str.charAt(1))) {
            return stringClean(str.substring(1));

        } else {
            return str.charAt(0) + stringClean(str.substring(1));
            
        }
    }

    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza")); // "yza"
        System.out.println(stringClean("abbbcdd")); // "abcd"
        System.out.println(stringClean("Hello")); // "Helo"
        System.out.println(stringClean("Piiinggg")); // "Ping"
        System.out.println(stringClean("Mmerrrcedd"));// "Merced"
    }
}