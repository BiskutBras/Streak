package week1;

import java.util.ArrayList;

public class Day03_EvenNumber {

    public static int[] filterEvenNumbers(int[] myInts) {

        int[] filtered = {};

        for (int number : myInts) {

            if (number % 2 == 0) {
//                filtered.add(number);
            }
        }

        return filtered;
    }

    public static String toString(int[] myInts) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int n : myInts) {
            sb.append(n);
            sb.append(",");
        }
        sb.append("}");

        return sb.toString();
    }

    public static void main(String[] args) {

        int[] myInts = {3, 5, 2, 8, 2, 4, 2, 7, 8, 5, 7, 2, 1, 5, 5, 32};

    }
}
