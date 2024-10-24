package Question3;

public class Question3 {
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.length() >= 3 && str.substring(str.length() - 2).equals("hi") && str.charAt(str.length() - 3) != 'x') {
            return 1 + countHi2(str.substring(0, str.length() - 2));

        } else if (str.length() >= 2 && str.substring(str.length() - 2).equals("hi")) {
            return countHi2(str.substring(0, str.length() - 1)); 

        } else {
            return countHi2(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countHi2("xxhixx")); // 0
        System.out.println(countHi2("xhixhix")); // 0
        System.out.println(countHi2("hi")); // 0
        System.out.println(countHi2("xixhii")); // 0
        System.out.println(countHi2("hxihixhxxixhxihhihixxixhxixhixhixhixhxihxihxixhixhxihxix")); // 3
    }
    
}