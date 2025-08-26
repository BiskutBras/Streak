package week5;

public class Day5 {

    public static int sumOfEvenNumbers(int[] arr) {

        int sum = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumOfEvenNumbers(new int[]{2, 8, 4, 3, 5, 7, 9}));
    }
}
