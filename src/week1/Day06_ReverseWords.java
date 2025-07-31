package week1;

public class Day06_ReverseWords {

    public static String reverseWords(String sentence) {

        int leftPointer = 0;
        int rightPointer = 0;

        while (sentence.charAt(rightPointer) != ' ') {
            rightPointer++;
        }

        String word = sentence.substring(leftPointer, rightPointer);


        for (int i = rightPointer - 1; i >= leftPointer; i--) {
            System.out.println(sentence.charAt(i));
        }
        return null;
    }

    public static void main(String[] args) {

        String sentence = "Java is awesome";

        String reverseString = reverseWords(sentence);

        System.out.println(reverseString);
    }
}
