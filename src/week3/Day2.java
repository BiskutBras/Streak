package week3;

public class Day2 {

    public static int sumOfDigits(int n) {

        n = Math.abs(n);

        int answer = 0;

        // 472
        // 13
        while (n > 0) {

            answer += n % 10;
            n /= 10;

        }

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(-472));
    }
}
