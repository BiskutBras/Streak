package week1;

public class Day6 {

    public static String reverseWords(String sentence) {

        // create an array where each word is the element
        String[] words = sentence.split(" ");
        StringBuilder reverseWord = new StringBuilder();

        // reverse each word an append with space
        for (String word : words) {
            reverseWord.append(new StringBuilder(word).reverse().append(" "));
        }

        // remove the last space from sentence
        return reverseWord.toString().trim();
    }

    public static void main(String[] args) {

        String sentence = "Java is awesome";

        String reverseString = reverseWords(sentence);

        System.out.println(reverseString);
    }
}
