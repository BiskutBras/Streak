package week4;

public class Day2 {

    public static int numberReversal(int n) {

        int reverse = 0;

        while (n / 10 != 0) {

            reverse = reverse * 10 + n % 10;
            n /= 10;

        }
        reverse = reverse * 10 + n % 10;
        return reverse;

    }

    public static void main(String[] args) {
        System.out.println(numberReversal(3956));
    }
}
