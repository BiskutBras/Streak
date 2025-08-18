package week4;

public class Day4 {

    public static boolean armstrongNumber(int n) {
        System.out.println("Day4.anagramChecker");

        int digitCount = String.valueOf(n).length();

        double sum = 0;
        int check = n;

        while (check > 10) {
            sum += Math.pow(check % 10, digitCount);
            check /= 10;
        }

        sum += Math.pow(check % 10, digitCount);

        System.out.println("sum = " + sum);
        return n == sum;
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(8208));
    }
}
