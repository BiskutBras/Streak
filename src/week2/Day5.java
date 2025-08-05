package week2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Day5 {

    public static boolean isPangram(String sentence) {

        HashSet<Character> mySet = new HashSet<>(26);


        for (Character c : sentence.toLowerCase().toCharArray()) {

            if (Character.isLetter(c)) {
                mySet.add(c);
            }

        }
        System.out.println(mySet);
        return mySet.size() == 26;

    }

    public static void main(String[] args) {

        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
    }

}
