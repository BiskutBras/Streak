package week3;

import java.util.HashMap;

@SuppressWarnings("Java8MapApi")
public class Day5 {

    public static String runLengthEncode(String s) {

        char currentChar = ' ';
        HashMap<Character, Integer> myMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();


        for (char c : s.toCharArray()) {

            int count = 1;

            if (myMap.containsKey(c)) {
                int currentCount = myMap.get(c);
                myMap.put(c, currentCount + 1);

            } else {
                myMap.put(c, count);
            }
        }

        for (char c : s.toCharArray()) {

            if (currentChar != c && currentChar != ' ') {
                sb.append(currentChar).append(myMap.get(currentChar));
                System.out.println(sb);
            }

            currentChar = c;
        }
        sb.append(currentChar).append(myMap.get(currentChar));


        return sb.toString();
    }

    public static void main(String[] args) {

        // aaabbc return a3b2c1
        // problem abaa will return a3b1 instead of a1b1a2
        System.out.println(runLengthEncode("aaabbc"));

    }
}
