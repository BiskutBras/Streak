package week6;

import java.util.Arrays;

public class Day4 {

    public static int[] reverseArray(int[] arr, int k) {

        while (k > 0) {
            int lastE = arr[arr.length - 1];

            for (int i = arr.length - 1; i >= 0; i--) {


                if (i == 0) {
                    arr[i] = lastE;
                } else {
                    arr[i] = arr[i - 1];
                }

            }
            k--;
        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6}, 2)));

        // 1, 2, 3, 4, 5, 6
        // 6, 1, 2, 3, 4, 5
        // 5, 6, 1, 2, 3, 4
    }
}
