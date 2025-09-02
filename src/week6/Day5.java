package week6;

import java.util.HashSet;

public class Day5 {

    public static boolean uniqueCharacters(String s) {

        HashSet<Character> mySet = new HashSet<>();

        for (char c : s.toCharArray()) {

            if (!mySet.add(c)) {
                return false;
            }


        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("abc"));
    }
}
