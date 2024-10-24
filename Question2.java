package Question2;
public class Question2 {

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countHi("xxhixx")); // 1
        System.out.println(countHi("xhixhix")); // 2
        System.out.println(countHi("hi")); // 1
        System.out.println(countHi("hixxxhxhixh")); // 2
        System.out.println(countHi("hxihixhxxixhxihhihixxixhxixhixhixhixhxihxihxixhixhxihxix")); // 7
    }
}