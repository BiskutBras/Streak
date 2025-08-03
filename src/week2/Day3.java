package week2;

import java.util.HashSet;

public class Day3 {

    public static char firstNonRepeatingChar(String s) {
        int[] freq = new int[256]; // ASCII size

        // First pass: count occurrences
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Second pass: find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '_'; // No non-repeating character
    }


    public static void main(String[] args) {

        System.out.println(firstNonRepeatingChar("hioahfaohf"));
    }
}
