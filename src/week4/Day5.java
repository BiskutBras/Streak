package week4;

import java.util.Arrays;

public class Day5 {

    public static int[] countVowelConsonant(String s) {

        System.out.println("Day5.countVowelConsonant");

        String cleaned = s.toLowerCase().replaceAll("[^a-z]", "");

        int consonant = 0;
        int vowel = 0;

        for (char c : cleaned.toCharArray()) {

            if ("aeiou".indexOf(c) == -1) {
                consonant++;
            } else {
                vowel++;
            }
        }

        System.out.println("vowel = " + vowel);
        System.out.println("consonant = " + consonant);
        return new int[]{vowel, consonant};

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(countVowelConsonant("I love Codecademy")));

    }


}
