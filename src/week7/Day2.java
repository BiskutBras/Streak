package week7;

public class Day2 {

    // sum of elements in 2d array
    public static int sumArray(int[][] arr) {

        int ans = 0;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                ans += anInt;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[][]{{2, 3, 4, 1, 3}, {2, 4, 2, 4}}));

    }

}
