package week7;

import java.util.HashSet;

public class Day1 {

    public static int removeDuplicate(int[] arr) {

        HashSet<Integer> mySet = new HashSet<>();
        int dup = 0;

        for (int i : arr) {
            if (!mySet.add(i)) {
                dup = i;
            }
        }

        return dup;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[]{1, 3, 3, 5, 2, 6, 8}));
    }
}
