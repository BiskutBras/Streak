package week6;

public class Day2 {

    public static void fibonacci(int n) {

        int first = 0;
        int sec = 1;

        System.out.println(first);
        System.out.println(sec);
        for (int j = 0; j < n - 2; j++) {

            int next = sec + first;
            System.out.println(next);
            first = sec;
            sec = next;

        }

    }

    public static void main(String[] args) {
        fibonacci(7);
    }
}
