package week1;

import java.util.ArrayList;

public class Day3 {

    public static ArrayList<Integer> filterEvenNumbers(int[] myInts) {

        ArrayList<Integer> filtered = new ArrayList<>();

        for (int number : myInts) {

            if (number % 2 == 0) {
                filtered.add(number);
            }
        }

        return filtered;
    }

    public static void main(String[] args) {

        System.out.println(filterEvenNumbers(
                new int[]{3, 5, 2, 8, 2, 4, 2, 7, 8, 5, 7, 2, 1, 5, 5, 32}
        ));

    }
}
