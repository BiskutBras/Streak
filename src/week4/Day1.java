package week4;

public class Day1 {

    public static String findTheWord(String sentence, int wordPosition) {

        System.out.println("Day1.findTheWord");

        if (sentence == null || sentence.isBlank()) return "sentence is empty";
        if (wordPosition <= 0) return "please insert valid position";

        String[] words = sentence.split("\\s+");
        if (wordPosition > words.length) return "exceed word count!";

        return words[wordPosition - 1];

    }

    public static void main(String[] args) {

        System.out.println(findTheWord("I love to eat", 2));

    }
}
