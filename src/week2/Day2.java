package week2;

import java.util.HashSet;

public class Day2 {

    public static boolean hasAllUniqueChars(String input) {
        HashSet<Character> strSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {

            // return false if element already exist in set
            if (!strSet.add(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(hasAllUniqueChars("abcdef"));
        System.out.println(hasAllUniqueChars("hello"));
        System.out.println(hasAllUniqueChars("Java123"));
        System.out.println(hasAllUniqueChars("aA"));
    }

}
