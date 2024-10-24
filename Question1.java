package Question1;
public class Question1 {
    public static void main(String[] args) {
        //test cases
        System.out.println(count8(8)); //1
        System.out.println(count8(818)); //2
        System.out.println(count8(8818)); //4
        System.out.println(count8(123456)); //0
        System.out.println(count8(88888)); //9
        System.out.println(count8(80808)); //3
    }

    public static int count8(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }
}
