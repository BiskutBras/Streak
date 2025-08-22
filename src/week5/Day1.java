package week5;

import java.util.HashMap;

public class Day1 {

    @SuppressWarnings("UnusedReturnValue")
    public static char firstNonRepeatChar(String s) {
        System.out.println("Day1.firstNonRepeatChar");
        char first;

        HashMap<Character, Integer> mySet = new HashMap<>();


        for (char c : s.toCharArray()) {

            if (mySet.containsKey(c)) {
                mySet.put(c, mySet.get(c) + 1);
            } else {
                mySet.put(c, 1);
            }
        }

        for (char c : s.toCharArray()) {

            if (mySet.get(c) == 1) {
                first = c;
                return first;
            }
        }

        return '?';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatChar("aabbcc"));
    }
}
