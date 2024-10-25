package Question4;

public class Question4 {
    public static int strCount(String str, String sub) {

        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);

        } else {
            return strCount(str.substring(1), sub);
        }
    }

    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat")); // 2
        System.out.println(strCount("catcowcat", "cow")); // 1
        System.out.println(strCount("catcowcat", "dog")); // 0
        System.out.println(strCount("countycontinuecountry", "cou")); // 2
        System.out.println(strCount("countycontinuecountry", "co")); // 3
    }
}
