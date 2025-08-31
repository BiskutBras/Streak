package week6;

public class Day3 {


    public static String findLongestWord(String sentence) {

        int length = 0;
        String longest = "";

        for (String s : sentence.split("\\s")) {

            if (s.length() > length) {
                length = s.length();
                longest = s;
            }


        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(findLongestWord("test my wordlength"));
    }
}
