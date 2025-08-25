package week5;

public class Day4 {

    public static int factorial(int n) {

        int answer = n;

        while (n > 1) {
            answer = answer * (n - 1);
            n -= 1;
        }

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(factorial(9));
    }
}
