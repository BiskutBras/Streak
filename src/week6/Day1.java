package week6;

import java.util.Arrays;

public class Day1 {

    public static int[] findMaxMin(int[] arr) {

        int max = 0, min = 0;
        
        for (int i : arr) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMaxMin(new int[]{2, 0, 45, 3, 8, 4})));
    }
}
